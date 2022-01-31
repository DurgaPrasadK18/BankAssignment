package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.AccountService;
import com.example.demo.entity.Accountdetails;

@RestController
public class Accountcontroller {
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/{id}/account")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addAccount(@RequestBody @Valid Accountdetails account, @PathVariable("id") Integer id) {
		accountService.addAccount(account, id);
	}
	

}
