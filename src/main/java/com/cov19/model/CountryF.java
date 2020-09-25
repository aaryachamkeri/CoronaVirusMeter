package com.cov19.model;



/* */
public class CountryF {
	
	private String Country;
	private String CountryCode;
	private String slug;
	private int NewConfirmed;
	private int TotalConfirmed;
	private int NewDeaths;
	private int TotalDeaths;
	private int NewRecovered;
	private int TotalRecovered;
	private String date;
	private Object Premium;
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public int getNewConfirmed() {
		return NewConfirmed;
	}
	public void setNewConfirmed(int newConfirmed) {
		NewConfirmed = newConfirmed;
	}
	public int getNewDeaths() {
		return NewDeaths;
	}
	public void setNewDeaths(int newDeaths) {
		NewDeaths = newDeaths;
	}
	public int getTotalDeaths() {
		return TotalDeaths;
	}
	public void setTotalDeaths(int totalDeaths) {
		TotalDeaths = totalDeaths;
	}
	public int getNewRecovered() {
		return NewRecovered;
	}
	public void setNewRecovered(int newRecovered) {
		NewRecovered = newRecovered;
	}
	public int getTotalRecovered() {
		return TotalRecovered;
	}
	public void setTotalRecovered(int totalRecovered) {
		TotalRecovered = totalRecovered;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Object getPremium() {
		return Premium;
	}
	public void setPremium(Object premium) {
		Premium = premium;
	}
	public int getTotalConfirmed() {
		return TotalConfirmed;
	}
	public void setTotalConfirmed(int totalConfirmed) {
		TotalConfirmed = totalConfirmed;
	}
	
	
}
