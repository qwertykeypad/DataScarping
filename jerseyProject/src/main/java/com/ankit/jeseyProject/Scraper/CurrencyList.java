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

public class CurrencyList 
{

	public List<Currency> getCurrencyScraper() throws IOException
	{
		Document doc = null;
		List<Currency> currency = new ArrayList<>();
		try 
		{
			//Currency curr = new Currency();
			doc = Jsoup.connect("https://www.bundesbank.de/dynamic/action/de/statistiken/zeitreihen-datenbanken/zeitreihen-datenbank/759778/759778?listId=www_s331_b01012_3").get();
			Elements rows = doc.getElementsByTag("TR");
			for (Element row : rows) 
			{
				Elements tds = row.getElementsByTag("TD");
				if(tds.size()>0)
				{	
					Currency curr = new Currency();
					String[] arr= tds.get(1).text().toString().split("/ ", 4);
					curr.setTitle(arr[2]);
					//ObjectMapper mapper = new ObjectMapper();
					//String jsonString = mapper.writeValueAsString(curr) ;
					currency.add(curr);
					//System.out.println(jsonString);
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