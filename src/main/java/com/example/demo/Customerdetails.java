package com.example.demo;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Customer")
public class Customerdetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@NotBlank
	@Size(max=25)
	private String Customername;
	public String getCustomername() {
		return Customername;
	}

	public void setCustomername(String customername) {
		Customername = customername;
	}
	
	@NotBlank
	private String Gender;
	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
	
	@NotEmpty
	@DateTimeFormat(pattern= "DD-MON-YY")
	private Date DOB;
	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	@NotBlank
    @Size(max=50)
	private String address;
    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

	@NotBlank
	@Size(max=25)
	private String city;
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@NotBlank
	@Size(max=25)
	private String State;
	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	} 
	
	
	@Size(max=7)
	private int pin;
	
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
    @Size(max=15)
	private String Telephone_no;
    public String getTelephone_no() {
		return Telephone_no;
	}

	public void setTelephone_no(String telephone_no) {
		Telephone_no = telephone_no;
	}
    
    
	private String Fax;
	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}
	
	
	@NotBlank
	@Size(max=30)
	@Pattern(regexp="^[0-9 a-z A-Z ]+ @[0-9 a-z A-Z .-]+$")
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}