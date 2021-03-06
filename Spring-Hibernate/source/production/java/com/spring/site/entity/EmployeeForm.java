package com.spring.site.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.spring.site.validation.Email;
import com.spring.site.validation.NotBlank;

public class EmployeeForm {

	@NotBlank(message = "{validate.employee.firstName}")
	@Size(min=1, message = "MIN<=1{validate.employee.firstName}")
	private String firstName;
	
	@NotBlank(message = "{validate.employee.lastName}")
	@Size(min=1, message = "MIN<=1{validate.employee.lastName}")
	private String lastName;
	
	private String middleName;
	
	@NotBlank(message = "{validate.employee.email}")
	@Email(message = "{validate.employee.email}")
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
