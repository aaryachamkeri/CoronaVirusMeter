package com.cov19.model;

import java.util.List;
import java.util.StringTokenizer;




public class MainCovObj {
	
	
	private GlobalCases Global;
	private List<Country> Countries;
	private String date;
	

	public MainCovObj() {
		
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		StringTokenizer stk = new StringTokenizer(date, "T");
		this.date = stk.nextToken();
	}
	public GlobalCases getGlobal() {
		return Global;
	}
	
	
	
	public void setGlobal(GlobalCases Global) {
		this.Global = Global;
	}
	public List<Country> getCountries() {
		return Countries;
	}
	public void setCountries(List<Country> Countries) {
		this.Countries = Countries;
	}
	
	public String toString() {
		return "Not null";
	}
}
