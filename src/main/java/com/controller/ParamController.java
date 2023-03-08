package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.User;

@Controller
public class ParamController {

	/*
	 * we are requesting value from url and assinging into fields in paramerter.
	 * then by creating the user object set the values in the resp. fields.
	 * set the object using addobject method with key
	 * 
	 * then show the data in jsp page.
	 * 
	 * note:- for optinal parameter we can required=false, but we have to set default value as well defaultValue="value"
	 * now if we didn't pass email in parameter still this will work.
	 */
	@GetMapping("/show")
	public ModelAndView showDataFromParam(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value = "email", required = false, defaultValue = "100") String email) {
		User u = new User();
		u.setId(id);
		u.setName(name);
		u.setEmail(email);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user1", u);
		modelAndView.setViewName("regResult");
		return modelAndView;
	}
}
