package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Depositdetails;
import com.example.demo.Repository.Depositrepository;

@Service
public class DepositService {
	
@Autowired
Depositrepository depositRepository;

public void saveDeposit(Depositdetails deposit) {
	depositRepository.save(deposit);
}

public Iterable<Depositdetails> getDeposit() {
	// TODO Auto-generated method stub
	return depositRepository.findAll();
}

public Optional<Depositdetails> getCustomers(Integer id) {
	return depositRepository.findById(id);
}

public void deleteDeposit(Integer id) {
	// TODO Auto-generated method stub
	depositRepository.deleteById(id);
}
}
