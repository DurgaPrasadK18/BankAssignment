package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CustomerService;
import com.example.demo.entity.Customerdetails;

@RestController
public class Customercontroller {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customer")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addCustomer(@RequestBody @Valid Customerdetails customer) {
		customerService.addUser(customer);
			
	}
}
