package com.example.demo.Service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Accountrepository;
import com.example.demo.Repository.Customerrepository;
import com.example.demo.entity.Accountdetails;
import com.example.demo.entity.Customerdetails;


@Service
public class AccountService {
	
	@Autowired
	private Accountrepository accountRepository;
	@Autowired
	private Customerrepository customerRepository;

	public void addAccount(@Valid Accountdetails account, Integer id) {
		Customerdetails customer = customerRepository.findById(id).get();
		Accountdetails acc = customer.getAccount();
		
		accountRepository.save(acc);
		customerRepository.save(customer);
		
	}

}
