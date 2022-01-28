package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
public class Depositdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank
	@Size(max = 10)
	@Pattern(regexp = "^[0-9]+$")
	private int Account_Number;

	@NotBlank
	@Range(min = 1)
	@Pattern(regexp = "^[0-9]+.[0-9][0-9]$")
	private int amount;

	private String description;

	public int getAccount_Number() {
		return Account_Number;
	}

	public void setAccount_Number(int account_Number) {
		Account_Number = account_Number;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
