package com.cts.emart.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.emart.beans.Customers;

public interface CustomerRepository extends CrudRepository<Customers, Integer>{
	
	//if you want to search by our own properties then write methods here....
	
	//default search method is searchById

}
