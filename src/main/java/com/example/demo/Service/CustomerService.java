package com.example.demo.Service;

 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Accountrepository;
import com.example.demo.Repository.Customerrepository;
import com.example.demo.Repository.Depositrepository;
import com.example.demo.entity.Accountdetails;
import com.example.demo.entity.Customerdetails;
import com.example.demo.entity.Depositdetails;

@Service
public class CustomerService  {
	@Autowired
	private Customerrepository customerRepository;
	
	@Autowired
	private Depositrepository depositRepository;
	
	@Autowired
	private Accountrepository accountRepository;
	
	
	
	public void addUser(Customerdetails customer) {
		Depositdetails dep = customer.getDeposit();
		Accountdetails acc = customer.getAccount();
		
		depositRepository.save(dep);
		customerRepository.save(customer);
		accountRepository.save(acc);
		
		

}
}
