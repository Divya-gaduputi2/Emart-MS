package com.cts.emart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.beans.Customers;
import com.cts.emart.repository.CustomerRepository;

@Service
public class CustomerService {
	

	
	@Autowired
	CustomerRepository repo;
	
	public List<Customers> getAll(){
		return (List<Customers>) repo.findAll();
	}
	
	public void addCustomer(Customers customer){
		
		repo.save(customer);
		
	}
	
	public Optional<Customers> getDetailsById(int customerId) {
		
		return repo.findById(customerId);
	}

}
//public List<Customers> getAll(){
//return Arrays.asList(
//		new Customers(1,"div","gadu","hfjks@gmail.com","6478903746","49-d3","kolii","banglore",518220),
//		new Customers(2,"sow","dya","lkhglk@gmail.com","7542136980","47-d3","krishna nagar","atp",518002),
//		new Customers(3,"saho","nag","kfjd@gmail.com","1236547890","49-e2","kailash","swargh",998862));
//}