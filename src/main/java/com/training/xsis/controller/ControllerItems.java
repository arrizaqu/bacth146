package com.training.xsis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.training.xsis.model.Items;
import com.training.xsis.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ControllerItems {
	
	@Autowired
	ItemsService itemsService;

	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody Items item) {
		itemsService.save(item);
	}
	
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	@ResponseBody
	public List<Items> getAllItems(){
	 return	itemsService.getAll();
	}
}
