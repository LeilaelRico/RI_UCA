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

# Creation of txt where site's title and link will be saved
archivo = open("sitesVisited.txt", "w", encoding='utf-8')


# Function that calls the crawler for future recursion.
def creWikiCrawler(url):
	response = requests.get(
		url=url,
	)

	dataPull = BeautifulSoup(response.content, 'html.parser')

	wikiTitle = dataPull.find(id="firstHeading")
	print(url)
	archivo.write(wikiTitle.text + ":    " + url + "\n")

	findAllLinks = dataPull.find(id="bodyContent").find_all("a")
	random.shuffle(findAllLinks)
	linkToScrape = 0

	for link in findAllLinks:
		# Condition will check and choose link that is part of a wiki.
		if link['href'].find("/wiki/") == -1:
			continue

		# Link is used to scrape
		linkToScrape = link
		break

	creWikiCrawler("https://es.wikipedia.org" + linkToScrape['href'])


creWikiCrawler("https://es.wikipedia.org/wiki/Wikipedia:Portada")
