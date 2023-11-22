'''************************************************************************************
Universidad de Cádiz
Grado en Ingeniería Informática
Cristian Leilael Rico Espinosa
Recuperación de Información
Práctica 3: Crawler Avanzado
************************************************************************************'''

# Import Libraries
import requests
from bs4 import BeautifulSoup
import random
import re

# Creation of txt where site's title and link will be saved
resultsFile = open("sitesVisited.txt", "w", encoding='utf-8')


# Function that calls the crawler for future recursion.
def creWikiCrawler(url):
	response = requests.get(
		url=url,
	)

	dataPull = BeautifulSoup(response.content, 'html.parser',
	                         on_duplicate_attribute='ignore')

	wikiTitle = dataPull.find(id="firstHeading")
	resultsFile.write(wikiTitle.text + "     ------->     " + url + "\n")
	print("Sitio: " + wikiTitle.text + "     ------->     URL:" + url + "\n")

	# findAllLinks includes a regex expression that searchs the urls with /wiki/ on it.
	findAllLinks = dataPull.find(id="bodyContent").find_all(
		"a", href=re.compile("^(/wiki/)"))
	random.shuffle(findAllLinks)

	for link in findAllLinks:

		# Condition will check and choose link that is part of a wiki from Wikipedia Spain, in case a link
		# is not, function will be called with another default link.
		if 'href' in link.attrs:
			creWikiCrawler("https://es.wikipedia.org" + link['href'])

		else:
			creWikiCrawler("https://es.wikipedia.org/wiki/Gravedad")


creWikiCrawler("https://es.wikipedia.org/wiki/Wikipedia:Portada")
