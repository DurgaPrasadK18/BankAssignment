package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "account")
public class Accountdetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accid;
	
	
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 10)
	@NotBlank
	@NotNull
	private String custId;
	
	
	@Pattern(regexp ="^Saving?$|^Current?$")
	@NotBlank
	private String accType;
	
	
	@Pattern(regexp = "[0-9]+(\\.[0-9][0-9]?)?")
	@Range(min = 500)
	private Double initalDep;
	
	@OneToOne(mappedBy = "account")
	private Customerdetails customer;
	
	@OneToMany(mappedBy = "account")
	private List<Depositdetails> deposit;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Double getInitalDep() {
		return initalDep;
	}

	public void setInitalDep(Double initalDep) {
		this.initalDep = initalDep;
	}
	
	
}