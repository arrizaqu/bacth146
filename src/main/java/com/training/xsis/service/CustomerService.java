package com.training.xsis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.xsis.dao.CustomerDao;
import com.training.xsis.model.Customer;

@Transactional
@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.save(customer);
	}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return customerDao.getAll();
	}

}
