package com.training.xsis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.xsis.model.Customer;
import com.training.xsis.model.Items;
import com.training.xsis.model.Pembelian;
import com.training.xsis.service.CustomerService;
import com.training.xsis.service.ItemsService;
import com.training.xsis.service.PembelianService;

@Controller
@RequestMapping("/pembelian")
public class PembelianController {

	@Autowired
	CustomerService customerService;
	@Autowired
	ItemsService itemsService;
	@Autowired
	PembelianService pembelianService;
	@RequestMapping
	public String index(Model model) {
		
		List<Customer> listCustomer = customerService.getAll();
		List<Items> listItems = itemsService.getAll(); 
		model.addAttribute("listCustomers", listCustomer);
		model.addAttribute("listItems", listItems);
		
		return "pembelian";
	}
	
	//bayar
	@RequestMapping(value="/bayar", method=RequestMethod.POST)
	@ResponseBody
	public Pembelian bayar(@RequestBody Pembelian pembelian) {
		pembelianService.bayar(pembelian);
		return pembelian;
	}
}
