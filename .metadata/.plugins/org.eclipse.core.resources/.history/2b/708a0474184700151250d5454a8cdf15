package com.spring.site.controller;

import java.util.Map;

import javax.inject.Inject;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.site.entity.Employee;
import com.spring.site.entity.EmployeeForm;
import com.spring.site.service.EmployeeService;

@Controller
public class EmployeeController {
	@Inject EmployeeService employeeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listEmployees(Map<String, Object> model){
		model.put("employees", this.employeeService.getAllEmployee());
		return "employee/list";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createEmployee(Map<String, Object> model){
		model.put("employeeForm", new EmployeeForm());
		return "employee/create";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createEmployee(Map<String, Object> model,
											@Valid EmployeeForm form, Errors errors){
		System.out.println("CREATE POST...");
		if(errors.hasErrors()){
			model.put("employeeForm", form);
			return new ModelAndView("employee/create");
		}
		
		Employee employee = new Employee();
		employee.setFirstName(form.getFirstName());
		employee.setLastName(form.getLastName());
		employee.setMiddleName(form.getMiddleName());
		try{
			this.employeeService.saveEmployee(employee);
		}catch(ConstraintViolationException e){
			model.put("validationErrros", e.getConstraintViolations());
			return new ModelAndView("employee/create");
		}
		
		return new ModelAndView(new RedirectView("/", true, false));
	}
											
											

}
