package com.spring.site.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.site.entity.Employee;

@Service
public class DefaultEmployeeService implements EmployeeService{
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee());
		employees.add(new Employee());
		
		return employees;
	}
	
	@Override
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
