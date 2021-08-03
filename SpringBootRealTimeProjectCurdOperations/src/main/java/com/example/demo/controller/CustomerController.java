package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Customer;
import com.example.demo.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService service;
	
	@GetMapping("/register")
	public String showRegisterPage(Model model,Customer c) {
		
		//model.addAttribute("customer", c);
		return "Register";
	}
	@PostMapping("/save")
	//@RequestMapping(value="/save",method=RequestMethod.POST)
	public String showEveryTimeIfEntered(@ModelAttribute Customer custo,ModelMap model) {
		Integer id=service.saveCustomer(custo);
		model.addAttribute("message","saved"+id);
		//model.addAttribute("customer", new Customer());
		return "Register";
	}
	@GetMapping("/all")
	public String getAllData(ModelMap map) {
	List<Customer> c=	service.getAllCustomers();
		map.addAttribute("list",c);
		return "Data";
	}
	@GetMapping("/delete/{cid}")
	public String deleteOneRow(@PathVariable Integer cid,Model model) {
		service.deleteCustomer(cid);
		List<Customer> c=service.getAllCustomers();
		model.addAttribute("list", c);	
		return "Data";
	}
	@GetMapping("/update/{id}")
	public String updateRow(@PathVariable Integer id,Model model) {
		Customer c=service.updateCustomer(id);
		model.addAttribute("customer", c);
		return "Edit";
	}
}