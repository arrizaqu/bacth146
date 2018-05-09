package com.training.xsis.dao;

import java.util.List;

import com.training.xsis.model.Customer;

public interface CustomerDao {

	void save(Customer customer);

	List<Customer> getAll();

}
