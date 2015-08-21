package com.spring.site.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import com.spring.site.validation.Email;
import com.spring.site.validation.NotBlank;

public class Employee {
	private long id;
	
	@NotBlank(message = "{validate.employee.firstName}")
	private String firstName;
	
	@NotBlank(message ="{validate.employee.lastName}")
	private String lastName;
	
	private String middleName;
	
	@NotBlank(message= "{validate.employee.governmentId}")
	private String governmentId;
	
	@NotBlank(message= "{validate.employee.birthdate}")
	@Past(message= "{validate.employee.birthdate}")
	private Date birthDate;
	
	@NotBlank(message= "{validate.employee.gender}")
	private Gender gener;
	
	@NotBlank(message= "{validate.employee.badgeNumber}")
	private String badgeNumber;
	
	@NotBlank(message= "{validate.employee.address}")
	private String address;
	
	@NotBlank(message= "{validate.employee.city}")
	private String city;
	
	@NotBlank(message= "{validate.employee.state}")
	private String state;
	
	@NotBlank(message= "{validate.employee.phoneNumber}")
	private String phoneNumber;
	
	@NotBlank(message= "{validate.employee.email}")
	/*@Pattern(
			regexp = "^[a-z0-9`!#$%^&*'{}?/+=|_~-]+(\\.[a-z0-9`!#$%^&*'{}?/+=" +
 "|_~-]+)*@([a-z0-9]([a-z0-9-]*[a-z0-9])?)+(\\.[a-z0-9]" +
 "([a-z0-9-]*[a-z0-9])?)*$",
 			flags = {Pattern.Flag.CASE_INSENSITIVE},
 			message = "{validate.employee.email}"
			)	*/
	@Email
	private String email;
	
	@NotBlank(message = "{validate.employee.department}")
	private String department;
	
	@NotBlank(message= "{validate.employee.location}")
	private String location;
	
	@NotBlank(message= "{validate.employee.position}")
	private String position;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public String getGovernmentId() {
		return governmentId;
	}
	public void setGovernmentId(String governmentId) {
		this.governmentId = governmentId;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Gender getGener() {
		return gener;
	}
	public void setGener(Gender gener) {
		this.gener = gener;
	}
	public String getBadgeNumber() {
		return badgeNumber;
	}
	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
