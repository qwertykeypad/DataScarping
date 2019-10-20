package com.ankit.jeseyProject.Scraper;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import com.ankit.jeseyProject.Currency;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gargoylesoftware.htmlunit.html.HtmlElement;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class JapanScraper 
{

	public List<Currency> getCurrencyScraper() throws IOException
	{
		Document doc = null;
		List<Currency> currency = new ArrayList<>();
		try 
		{
			for(int i=0;i<21;i++) {
			//Currency curr = new Currency();
			String searchQuery = Integer.toString(i+1999);
			doc = Jsoup.connect("https://www.bundesbank.de/dynamic/action/de/statistiken/zeitreihen-datenbanken/zeitreihen-datenbank/723452/723452?tsId=BBEX3.D.JPY.EUR.BB.AC.000&tsTab=0&dateSelect="+ URLEncoder.encode(searchQuery, "UTF-8")).get();
			Elements rows = doc.getElementsByTag("TR");
			for (Element row : rows) 
			{
				Elements tds = row.getElementsByTag("TD");
				if(tds.size()>0)
				{	
					Currency curr = new Currency();
					curr.setTitle("JPY");
					curr.setDatem(tds.get(0).text().toString());
					curr.setWert(tds.get(1).text().toString());
					curr.setWertestatus(tds.get(2).text().toString());
					curr.setRvzvip(tds.get(3).text().toString());
					
					//ObjectMapper mapper = new ObjectMapper();
					//String jsonString = mapper.writeValueAsString(curr) ;
					currency.add(curr);
					curr=null;
					//System.out.println(jsonString);
				}
			}
			}
		} 	
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
		}
		return currency;
	}
}

