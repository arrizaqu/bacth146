package com.training.xsis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class Main {

	//index
	@ResponseBody
	@RequestMapping
	public String index() {
		return "index home page";
	}
	
	@ResponseBody
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		return "hello world spring framework";
	}
	
	@ResponseBody
	@RequestMapping(value="/profile", method=RequestMethod.GET)
	public String secondPage() {
		return "hello profile";
	}
	
}
