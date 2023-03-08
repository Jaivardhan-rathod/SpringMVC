package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Employee;

@Controller
public class ListController {
	
	@GetMapping("/employeeList")
	public ModelAndView sendEmpList() {
		System.out.println("Inside employeeList mapping");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("employeeList");
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("First Employee");
		emp.setSalary("1.5LPA");
		
		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.setName("Second Employee");
		emp1.setSalary("1.5LPA");
		
		Employee emp2 = new Employee();
		emp2.setId(3);
		emp2.setName("Third Employee");
		emp2.setSalary("1.5LPA");
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		
		modelAndView.addObject("EmployeeList", empList);
		return modelAndView;
	}
}
