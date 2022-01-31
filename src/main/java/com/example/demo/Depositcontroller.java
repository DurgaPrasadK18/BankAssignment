package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.Service.DepositService;
import com.example.demo.entity.Depositdetails;

public class Depositcontroller {
	@Autowired
	private DepositService depositService;
	@PostMapping("/{id}/deposit")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addDeposit(@RequestBody @Valid Depositdetails deposit, @PathVariable("id") Integer id) {
		depositService.addDeposit(deposit, id);
	}

}
