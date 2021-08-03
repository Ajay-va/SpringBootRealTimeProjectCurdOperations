package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;

public interface ICustomerService {

	
	public Integer saveCustomer(Customer cus);
	public List<Customer> getAllCustomers();
	public Customer getOneCustomer(Integer cusId);
	public void deleteCustomer(Integer id);
	public Customer updateCustomer(Integer id);
	}
