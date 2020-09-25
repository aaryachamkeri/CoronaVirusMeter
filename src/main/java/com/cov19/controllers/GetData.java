package com.cov19.controllers;

import java.io.BufferedReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
//import java.util.StringTokenizer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;


import com.cov19.model.Country;

public class GetData {

	
	
	
	public static List<Country> getData() throws Exception{
		//fetching from url
//        URL url = new URL("https://api.covid19api.com/summary");
		URL url = new URL("https://coronavirus-19-api.herokuapp.com/countries");
		
        InputStream is = url.openStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        //for temp storage of json fetched
        StringBuilder sb = new StringBuilder();


        //inserting
        String check = "";
        while((check = br.readLine()) != null) {
            sb.append(check);
        }

        
        //main object for mapping json
//        MainCovObj mco = new MainCovObj(); 
        

        //setting view and parameters


        //converting to a json object
//        JSONObject obj = new JSONObject(sb.toString());

        



//        JSONArray values = obj.getJSONArray("");
        JSONArray val = new JSONArray(sb.toString());

        Country[] countries = new Country[val.length()];

        for(int i = 0; i < val.length(); i ++) {

            //index of json object of main json objects array
            JSONObject index = val.getJSONObject(i);
            Country temp = new Country();
            
            try {
            	temp.setCountry(index.getString("country"));
            } catch(Exception e) {
            	temp.setCountry(index.getString(""));
            }
            try {
            	temp.setCases(index.getInt("cases"));
            } catch(Exception e) {
            	temp.setCases(0);
            }
            try {
            	temp.setTodayCases(index.getInt("todayCases"));
            } catch(Exception e) {
            	temp.setTodayCases(0);
            }
            try {
            	temp.setDeaths(index.getInt("deaths"));
            } catch(Exception e) {
            	temp.setDeaths(0);
            }
            try {
            	temp.setTodayDeaths(index.getInt("todayDeaths"));
            } catch(Exception e) {
            	temp.setTodayDeaths(0);
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            try {
            	temp.setRecovered(index.getInt("recovered"));
            } catch(Exception e) {
            	temp.setRecovered(0);
            }
            try {
            	temp.setActive(index.getInt("active"));
            } catch(Exception e) {
            	temp.setActive(0);
            }
            try {
            	temp.setCritical(index.getInt("critical"));
            } catch(Exception e) {
            	temp.setCritical(0);
            }
            try {
            	temp.setCasesPerOneMillion(index.getInt("casesPerOneMillion"));
            } catch(Exception e) {
            	temp.setCasesPerOneMillion(0);
            }
            try {
            	temp.setDeathsPerOneMillion(index.getInt("deathsPerOneMillion"));
            } catch(Exception e) {
            	temp.setDeathsPerOneMillion(0);
            }
            try {
            	temp.setTotalTests(index.getInt("totalTests"));
            } catch(Exception e) {
            	temp.setTotalTests(0);
            }
            try {
            	temp.setTestsPerOneMillion(index.getInt("testsPerOneMillion"));
            } catch(Exception e) {
            	temp.setTestsPerOneMillion(0);
            }
            
            
            
            
            
            
            
          

//          temp.setCountry(index.getString("Country"));
//          temp.setCountryCode(index.getString("CountryCode"));
//          temp.setSlug(index.getString("Slug"));
//          temp.setNewConfirmed(index.getInt("NewConfirmed"));
//          temp.setTotalConfirmed(index.getInt("TotalConfirmed"));
//          temp.setNewDeaths(index.getInt("NewDeaths"));
//          temp.setTotalDeaths(index.getInt("TotalDeaths"));
//          temp.setNewRecovered(index.getInt("NewRecovered"));
//          temp.setTotalRecovered(index.getInt("TotalRecovered"));
            
            
            
            
            
//            temp.setDate(stk.nextToken());
//            temp.setPremium(index.get("Premium"));



            //inserting into main array
            countries[i] = temp;

        }
        
        
        List<Country> cmain = Arrays.asList(countries);

//        JSONObject global = obj.getJSONObject("Global");
        
        
        
        //gc obj
//        GlobalCases gc = new GlobalCases();
        

        //setting the gc object
       
//        gc.setNewConfirmed(global.getInt("NewConfirmed"));
//        gc.setTotalConfirmed(global.getInt("TotalConfirmed"));
//        gc.setNewDeaths(global.getInt("NewDeaths"));
//        gc.setTotalDeaths(global.getInt("TotalDeaths"));
//        gc.setNewRecovered(global.getInt("NewRecovered"));
//        gc.setTotalRecovered(global.getInt("TotalRecovered"));
        
        
//        mco.setCountries(cmain);
//        mco.setGlobal(gc);
//        mco.setDate(obj.getString("Date"));
        br.close();
        is.close();
		
        
       return cmain;
	}
	
	//testing
//	public static void main(String[] args) {
//		try {
//			List<Country> x = getData();
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//	}
}
