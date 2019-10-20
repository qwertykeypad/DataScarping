package com.ankit.jeseyProject;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ankit.jeseyProject.Scraper.AustraliaScraper;
import com.ankit.jeseyProject.Scraper.BrazilScraper;
import com.ankit.jeseyProject.Scraper.BulgariaScraper;
import com.ankit.jeseyProject.Scraper.CanadaScraper;
import com.ankit.jeseyProject.Scraper.ChinaScraper;
import com.ankit.jeseyProject.Scraper.CroatiaScraper;
import com.ankit.jeseyProject.Scraper.CurrencyList;
import com.ankit.jeseyProject.Scraper.CyprusScraper;
import com.ankit.jeseyProject.Scraper.CzechRepublicScraper;
import com.ankit.jeseyProject.Scraper.DenmarkScraper;
import com.ankit.jeseyProject.Scraper.EstoniaScraper;
import com.ankit.jeseyProject.Scraper.GreeceScraper;
import com.ankit.jeseyProject.Scraper.HongKongScraper;
import com.ankit.jeseyProject.Scraper.HungaryScraper;
import com.ankit.jeseyProject.Scraper.IcelandScraper;
import com.ankit.jeseyProject.Scraper.IndiaScraper;
import com.ankit.jeseyProject.Scraper.IndonesiaScraper;
import com.ankit.jeseyProject.Scraper.IsraelScraper;
import com.ankit.jeseyProject.Scraper.JapanScraper;
import com.ankit.jeseyProject.Scraper.KoreaRepublicScraper;
import com.ankit.jeseyProject.Scraper.LatviaScraper;
import com.ankit.jeseyProject.Scraper.LithuaniaScraper;
import com.ankit.jeseyProject.Scraper.MalaysiaScraper;
import com.ankit.jeseyProject.Scraper.MaltaScraper;
import com.ankit.jeseyProject.Scraper.MexicoScraper;
import com.ankit.jeseyProject.Scraper.NewZealandScraper;
import com.ankit.jeseyProject.Scraper.NorwayScraper;
import com.ankit.jeseyProject.Scraper.PhilippinesScraper;
import com.ankit.jeseyProject.Scraper.PolandScraper;
import com.ankit.jeseyProject.Scraper.RomaniaScraper1;
import com.ankit.jeseyProject.Scraper.RomaniaScraper2;
import com.ankit.jeseyProject.Scraper.RussiaScraper;
import com.ankit.jeseyProject.Scraper.SingaporeScraper;
import com.ankit.jeseyProject.Scraper.SlovakiaScraper;
import com.ankit.jeseyProject.Scraper.SloveniaScraper;
import com.ankit.jeseyProject.Scraper.SouthAfricaScraper;
import com.ankit.jeseyProject.Scraper.SwedenScraper;
import com.ankit.jeseyProject.Scraper.SwitzerlandScraper;
import com.ankit.jeseyProject.Scraper.ThailandScraper;
import com.ankit.jeseyProject.Scraper.TurkeyScraper1;
import com.ankit.jeseyProject.Scraper.TurkeyScraper2;
import com.ankit.jeseyProject.Scraper.UnitedKingdomScraper;
import com.ankit.jeseyProject.Scraper.UnitedStatesScraper;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

@Path("currency")
public class CurrencyResource 
{
	@Path("list")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Currency> getCurrency() throws IOException
	{
		System.out.println("Get Curreny List Called");
		CurrencyList sc = new CurrencyList();
		List<Currency> currency = new ArrayList<>();
		currency = sc.getCurrencyScraper();
		return currency;
	}
	
	@Path("all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Currency> getCurrencyall() throws IOException
	{
		System.out.println("Get All Currencies Called");
		List<Currency> currency = new ArrayList<>();
		AustraliaScraper australia = new AustraliaScraper();
		BulgariaScraper bulgaria = new BulgariaScraper();
		BrazilScraper brazil = new BrazilScraper();
		CanadaScraper canada = new CanadaScraper();
		ChinaScraper china = new ChinaScraper();
		SwitzerlandScraper switzerland = new SwitzerlandScraper();
		CyprusScraper cyprus = new CyprusScraper();
		CzechRepublicScraper czechrepublic = new CzechRepublicScraper();
		DenmarkScraper denmark = new DenmarkScraper();
		EstoniaScraper estonia = new EstoniaScraper();
		HongKongScraper hongkong = new HongKongScraper();
		CroatiaScraper croatia = new CroatiaScraper();
		HungaryScraper hungary = new HungaryScraper();
		IndonesiaScraper indonesia = new IndonesiaScraper();
		IsraelScraper israel = new IsraelScraper();
		IndiaScraper india = new IndiaScraper();
		IcelandScraper iceland = new IcelandScraper();
		JapanScraper japan = new JapanScraper();
		KoreaRepublicScraper korearepublic = new KoreaRepublicScraper();
		LithuaniaScraper lithuania = new LithuaniaScraper();
		LatviaScraper latvia = new LatviaScraper();
		MaltaScraper malta = new MaltaScraper();
		MexicoScraper mexico = new MexicoScraper();
		MalaysiaScraper malaysia = new MalaysiaScraper();
		NorwayScraper norway = new NorwayScraper();
		NewZealandScraper newzealand = new NewZealandScraper();
		PhilippinesScraper philippines = new PhilippinesScraper();
		PolandScraper poland = new PolandScraper();
		RomaniaScraper1 romania1 = new RomaniaScraper1();
		RomaniaScraper2 romania2 = new RomaniaScraper2();
		RussiaScraper russia = new RussiaScraper();
		SwedenScraper sweden = new SwedenScraper();
		SingaporeScraper singapore = new SingaporeScraper();
		SloveniaScraper slovenia = new SloveniaScraper();
		SlovakiaScraper slovakia = new SlovakiaScraper();
		ThailandScraper thailand = new ThailandScraper();
		TurkeyScraper1 turkey1 = new TurkeyScraper1();
		TurkeyScraper2 turkey2 = new TurkeyScraper2();
		UnitedStatesScraper unitedstates = new UnitedStatesScraper();
		SouthAfricaScraper southafrica = new SouthAfricaScraper();
		UnitedKingdomScraper unitedkingdom = new UnitedKingdomScraper();
		GreeceScraper greece = new GreeceScraper();
		
		currency.addAll(australia.getCurrencyScraper());
		currency.addAll(bulgaria.getCurrencyScraper());
		currency.addAll(brazil.getCurrencyScraper());
		currency.addAll(canada.getCurrencyScraper());
		currency.addAll(china.getCurrencyScraper());
		currency.addAll(switzerland.getCurrencyScraper());
		currency.addAll(cyprus.getCurrencyScraper());
		currency.addAll(czechrepublic.getCurrencyScraper());
		currency.addAll(denmark.getCurrencyScraper());
		currency.addAll(estonia.getCurrencyScraper());
		currency.addAll(hongkong.getCurrencyScraper());
		currency.addAll(croatia.getCurrencyScraper());
		currency.addAll(hungary.getCurrencyScraper());
		currency.addAll(indonesia.getCurrencyScraper());
		currency.addAll(israel.getCurrencyScraper());
		currency.addAll(india.getCurrencyScraper());
		currency.addAll(iceland.getCurrencyScraper());
		currency.addAll(japan.getCurrencyScraper());
		currency.addAll(korearepublic.getCurrencyScraper());
		currency.addAll(lithuania.getCurrencyScraper());
		currency.addAll(latvia.getCurrencyScraper());
		currency.addAll(malta.getCurrencyScraper());
		currency.addAll(mexico.getCurrencyScraper());
		currency.addAll(malaysia.getCurrencyScraper());
		currency.addAll(norway.getCurrencyScraper());
		currency.addAll(newzealand.getCurrencyScraper());
		currency.addAll(philippines.getCurrencyScraper());
		currency.addAll(poland.getCurrencyScraper());
		currency.addAll(romania1.getCurrencyScraper());
		currency.addAll(romania2.getCurrencyScraper());
		currency.addAll(russia.getCurrencyScraper());
		currency.addAll(sweden.getCurrencyScraper());
		currency.addAll(singapore.getCurrencyScraper());
		currency.addAll(slovenia.getCurrencyScraper());
		currency.addAll(slovakia.getCurrencyScraper());
		currency.addAll(thailand.getCurrencyScraper());
		currency.addAll(turkey1.getCurrencyScraper());
		currency.addAll(turkey2.getCurrencyScraper());
		currency.addAll(unitedstates.getCurrencyScraper());
		currency.addAll(southafrica.getCurrencyScraper());
		currency.addAll(unitedkingdom.getCurrencyScraper());
		currency.addAll(greece.getCurrencyScraper());
		australia = null;
	    brazil = null;
	    bulgaria = null;
	    china = null;
	    croatia = null;
	    cyprus = null;
	    czechrepublic = null;
	    denmark = null;
	    estonia = null;
	    greece = null;
	    hongkong = null;
	    hungary = null;
	    iceland = null;
	    india = null;
	    indonesia = null;
	    israel = null;
	    japan = null; 
	    korearepublic = null;
	    latvia = null;
	    lithuania = null;
	    malaysia = null;
	    malta = null;
	    mexico = null;
	    newzealand = null;
	    norway = null;
	    philippines = null;
	    poland = null;
	    romania1 = null;
	    romania2 = null;
	    russia = null;
	    singapore = null;
	    slovakia = null;
	    slovenia = null;
	    southafrica = null;
	    sweden = null;
	    switzerland = null;
	    thailand = null;
	    turkey1 = null;
	    turkey2 = null;
	    unitedkingdom = null;
	    unitedstates = null;
	    
		return currency;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{datem}")
	public List<Currency> getCurrencyDate(@PathParam("datem") String datem) throws IOException
	{
		CurrencyResource sc = new CurrencyResource();
		System.out.println("Convert Currency By Date Called");
		List<Currency> currency = new ArrayList<>();
		List<Currency> returncurrency = new ArrayList<>();
		currency = sc.getCurrencyall();
		for(Currency c: currency)
		{
			if(c.getDatem().toString().equals(datem.toString())==true)
			{
				Currency curr = new Currency();
				curr.setTitle(c.getTitle());
				curr.setDatem(c.getDatem());
				curr.setWert(c.getWert());
				curr.setWertestatus(c.getWertestatus());
				curr.setRvzvip(c.getRvzvip());
				returncurrency.add(curr);
				curr = null;
			}
		}
		currency = null;
		return returncurrency;
	}
	
	@GET
	@Path("convert/{datem}/{amount}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Currency> getCurrencyByAmount(@PathParam("datem") String datem, @PathParam("amount") String amount) throws IOException
	{
		System.out.println("Convert Currency By Amount");
		List<Currency> currency = new ArrayList<>();
		List<Currency> returncurrency = new ArrayList<>();
		CurrencyResource sc = new CurrencyResource();
		String var;
		currency = sc.getCurrencyall();
		for(Currency c: currency)
		{
			if(c.getDatem().toString().equals(datem.toString())==true)
			{
				Currency curr = new Currency();
				curr.setTitle(c.getTitle());
				curr.setDatem(datem);
				System.out.println(c.getTitle() + "    "+ c.getWert());
				var = c.getWert().toString().replace(".", "");
				curr.setWert(Float.toString((Float.parseFloat(amount)/Float.parseFloat(var.replace(',', '.')))));
				curr.setWertestatus(c.getWertestatus());
				curr.setRvzvip(c.getRvzvip());
				returncurrency.add(curr);
				curr = null;
				//return Float.toString((Float.parseFloat(amount)/Float.parseFloat(c.getWert().toString().replace(',', '.'))));
			}
		}
		currency = null;
		return returncurrency;
	}
	
}
