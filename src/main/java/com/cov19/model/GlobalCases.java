package com.cov19.model;



public class GlobalCases {
    private int NewConfirmed;
    private int TotalConfirmed;
    private int NewDeaths;
    private int TotalDeaths;
    private int NewRecovered;
    private int TotalRecovered;
	public int getNewConfirmed() {
		return NewConfirmed;
	}
	public void setNewConfirmed(int NewConfirmed) {
		this.NewConfirmed = NewConfirmed;
	}
	public int getTotalConfirmed() {
		return TotalConfirmed;
	}
	public void setTotalConfirmed(int TotalConfirmed) {
		this.TotalConfirmed = TotalConfirmed;
	}
	public int getNewDeaths() {
		return NewDeaths;
	}
	public void setNewDeaths(int NewDeaths) {
		this.NewDeaths = NewDeaths;
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
	
	public String toString() {
		return "Not null";
	}
}
