package com.cov19.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController{

	
	@RequestMapping("/error")
	public String handleError() {
		return "error.jsp";
	}
	
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error.jsp";
	}

}
