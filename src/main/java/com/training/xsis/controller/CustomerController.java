package com.training.xsis.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.type.CustomCollectionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.training.xsis.model.Customer;
import com.training.xsis.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@Valid @RequestBody Customer customer) {
		customerService.save(customer);
	}
	
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	@ResponseBody
	public List<Customer> getAllCustomer(){
		List<Customer> customers = customerService.getAll();
		return customers;
	}
}
