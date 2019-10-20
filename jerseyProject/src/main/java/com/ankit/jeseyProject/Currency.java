package com.ankit.jeseyProject;

//import javax.xml.bind.annotation.XmlRootElement;

//import com.fasterxml.jackson.annotation.JsonTypeName;

//@JsonTypeName
//@XmlRootElement
public class Currency 
{
	private String title;
	private String datem;
	private String wert;
	private String wertestatus;
	private String rvzvip;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDatem() {
		return datem;
	}
	public void setDatem(String datem) {
		this.datem = datem;
	}
	public String getWert() {
		return wert;
	}
	public void setWert(String wert) {
		this.wert = wert;
	}
	public String getWertestatus() {
		return wertestatus;
	}
	public void setWertestatus(String wertestatus) {
		this.wertestatus = wertestatus;
	}
	public String getRvzvip() {
		return rvzvip;
	}
	public void setRvzvip(String rvzvip) {
		this.rvzvip = rvzvip;
	}
	@Override
	public String toString() {
		return "Currency [title=" + title + ", datem=" + datem + ", wert=" + wert + ", wertestatus=" + wertestatus
				+ ", rvzvip=" + rvzvip + "]";
	}
	
	
}
