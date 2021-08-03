package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.ICustomerService;

@Service
public class CustomerImpl implements ICustomerService{

	@Autowired 
	private CustomerRepository repo;

	@Override
	public Integer saveCustomer(Customer cus) {
		cus=repo.save(cus);
		Integer id=cus.getCustId();	
		return id;
	}
	@Override
	public List<Customer> getAllCustomers() {
		return  repo.findAll();	
	}
	@Override
	public Customer getOneCustomer(Integer cusId) {
		return	repo.getById(cusId);	
	}
	@Override
	public void deleteCustomer(Integer id) {
		repo.deleteById(id);	
	}
	@Override
	public Customer updateCustomer(Integer id) {
		//repo.
		return repo.findById(id).get();
	}	
}