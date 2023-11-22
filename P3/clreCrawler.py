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
from time import sleep
import re

# Creation of txt where site's title and link will be saved
archivo = open("sitesVisited.txt", "w", encoding='utf-8')


# Function that calls the crawler for future recursion.
# Timeout instruction tells function to wait 5 seconds before doing a new get.
def creWikiCrawler(url):
	response = requests.get(
		url=url, timeout=3,
	)

	dataPull = BeautifulSoup(response.content, 'html.parser')

	wikiTitle = dataPull.find(id="firstHeading")
	# print(url)
	archivo.write(wikiTitle.text + ":    " + url + "\n")

	findAllLinks = dataPull.find(id="bodyContent").find_all(
		"a", href=re.compile("^(/wiki/)"))
	# print(findAllLinks)
	random.shuffle(findAllLinks)
	# print(findAllLinks)
	linkToScrape = 0

	for link in findAllLinks:

		# Condition will check and choose link that is part of a wiki from Wikipedia Spain.
		if link['href'].find("es.wikipedia.org"):
			continue

	print("https://es.wikipedia.org" + link['href'])

	creWikiCrawler("https://es.wikipedia.org" + link['href'])


creWikiCrawler("https://es.wikipedia.org/wiki/Wikipedia:Portada")
