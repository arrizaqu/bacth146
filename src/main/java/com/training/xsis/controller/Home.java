package com.training.xsis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class Home {

	//index
	@RequestMapping
	public String index() {
		
		//ref = /WEB-INF/view/home.jsp
		return "home";
	}
}
