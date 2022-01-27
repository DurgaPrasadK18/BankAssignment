package com.example.demo;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CustomerService;

@RestController
public class Controller {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customer")
	Iterable<Customerdetails> getcustomer() {
		return customerService.getCustomer();
	}
	
	@GetMapping("/customer/{id}")
	Optional<Customerdetails> getCustomers(@PathVariable("id") Integer id) {
		return customerService.getCustomers(id);
	}
	
	
	
	
	@PostMapping("/user")
	void addCustomer(@RequestBody Customerdetails newCustomer)
	{
		customerService.createCustomer(newCustomer);
	}
	
	@DeleteMapping("/customer/{id}")
	void deleteCustomer(@PathVariable("id") Integer id) {
		customerService.deleteCustomer(id);
	}
}
