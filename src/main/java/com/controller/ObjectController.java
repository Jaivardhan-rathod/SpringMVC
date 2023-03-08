package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Employee;

@Controller
public class ObjectController {
	
	@GetMapping("/employee")
	public ModelAndView sendObject() {
		System.out.println("Inside employee mapping");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Employee");
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("First Employee");
		emp.setSalary("1.5LPA");
		modelAndView.addObject("Emp1", emp);
		return modelAndView;
	}
}
