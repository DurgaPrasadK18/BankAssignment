package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Customerrepository;
import com.example.demo.Repository.Depositrepository;
import com.example.demo.entity.Customerdetails;
import com.example.demo.entity.Depositdetails;

@Service
public class DepositService {

	@Autowired
	private Depositrepository depositRepository;
	@Autowired
	private Customerrepository customerRepository;
	
	public void addDeposit(Depositdetails deposit, Integer id) {
		
		Customerdetails customer = customerRepository.findById(id).get();
		
		Double initial_amount = customer.getDeposit().getAmount();
		Double total_amount = initial_amount + deposit.getAmount();
		
		Depositdetails depositfinal = customer.getDeposit();
		depositfinal.setAmount(total_amount);
		
		
		depositRepository.save(depositfinal);
		customer.setDeposit(depositfinal);
		customerRepository.save(customer);
	}
	
}