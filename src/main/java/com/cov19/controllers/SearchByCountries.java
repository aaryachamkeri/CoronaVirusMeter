package com.cov19.controllers;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cov19.model.Country;

@Controller
public class SearchByCountries {
	
	
	
	
	@RequestMapping(value = "/getByCountry", method = {RequestMethod.GET})
	public ModelAndView searchByCountries(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		String countryName = req.getParameter("sbc").toLowerCase();
		
		try {
			
			List<Country> cl = GetData.getData();
			Country cm = null;
			
			
			main:
			for(Country c : cl) {
				if(c.getCountry().toLowerCase().equals(countryName)) {
					cm = c;
					break main;
				}
			}
			mv.addObject("country", cm);
			mv.setViewName("getByCountries.jsp");
			return mv;
		} catch(Exception e) {
			mv.setViewName("error.jsp");
		}
		
		return mv;
	}
}
