package com.example.demo;



import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CustomerService;
import com.example.demo.Service.DepositService;

@RestController
public class Controller {
	@Autowired
	CustomerService customerService;
	DepositService depositService;
	
	@GetMapping("/customer")
	Iterable<Customerdetails> getcustomer() {
		return customerService.getCustomer();
	}
	
	@GetMapping("/customer/{id}")
	Optional<Customerdetails> getCustomers(@PathVariable("id") Integer id) {
		return customerService.getCustomers(id);
	}
	@GetMapping("/deposit")
	Iterable<Depositdetails> getDeposit() {
		return depositService.getDeposit();
	}
	
	
	
	
	@PostMapping("/user")
	void addCustomer(@RequestBody Customerdetails newCustomer)
	{
		customerService.createCustomer(newCustomer);
	}
	@PostMapping("/deposit")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createDeposit(@RequestBody @Valid Depositdetails deposit) {
		customerService.saveDeposit(deposit);
	}
	
	@DeleteMapping("/customer/{id}")
	void deleteCustomer(@PathVariable("id") Integer id) {
		customerService.deleteCustomer(id);
	}
}
