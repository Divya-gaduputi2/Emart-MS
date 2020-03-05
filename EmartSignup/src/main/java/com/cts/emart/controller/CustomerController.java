package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.beans.Customers;
import com.cts.emart.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired 
	CustomerService service;
	
	@RequestMapping("/allusers")
	public List<Customers> getAll(){
		return service.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/allusers")
	public void addCustomer(@RequestBody Customers customer) {
		 service.addCustomer(customer);
	}
	
	@RequestMapping("/allusers/{customerId}")
	public Optional<Customers> getDetailsById(@PathVariable int customerId) {
		
		return service.getDetailsById(customerId);
	}
}
