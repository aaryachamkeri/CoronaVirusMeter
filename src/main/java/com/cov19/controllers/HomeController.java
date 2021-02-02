package com.cov19.controllers;

import java.util.List;


//import java.io.BufferedReader;
//
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.util.Arrays;
//import java.util.List;
//import java.util.StringTokenizer;
//
//import org.json.JSONArray;
//import org.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.cov19.model.*;







@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String getHome() {
		return "getCases";
	}

	
	
	@RequestMapping(value = "getCases", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView getCase() throws Exception{
		ModelAndView mv = new ModelAndView();
		List<Country> obj = GetData.getData();
		mv.addObject("Main Covid Object", obj);
		mv.setViewName("cases.jsp");
		return mv;
		
		

	}
	
	
	
	
}