package com.spring.site.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.spring.site.entity.Employee;

@Validated
public interface EmployeeService {
	
	public void saveEmployee(
			@NotNull(message = "{validate.employeeService.saveEmployee}") 
			@Valid Employee employee);
	
	public Employee getEmployee(
			@Min(value = 1L,
					message = "{validate.employeeService.getEmployee.id}") long id);
	
	@NotNull
	public List<Employee> getAllEmployee();
	
}
