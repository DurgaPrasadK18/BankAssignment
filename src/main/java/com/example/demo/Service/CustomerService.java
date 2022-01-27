package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Customerdetails;
import com.example.demo.Repository.Customerrepository;

@Service
public class CustomerService  {
	@Autowired
	Customerrepository customerRepo;
	public void createCustomer(Customerdetails newCustomer) {
		
		customerRepo.save(newCustomer);
	}

}
