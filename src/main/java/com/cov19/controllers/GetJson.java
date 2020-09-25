package com.cov19.controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetJson {

	@GetMapping(value = "/resources/json", produces = "application/json")
	public String getJson() throws Exception{
		URL u = new URL("https://coronavirus-19-api.herokuapp.com/countries");
		BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
		StringBuilder sb = new StringBuilder();
		String read;
		while((read = br.readLine()) != null) {
			sb.append(read);
		}
		br.close();
		return sb.toString();
	}
	
	
}
