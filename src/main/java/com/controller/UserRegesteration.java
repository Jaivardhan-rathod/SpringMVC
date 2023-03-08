package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.User;
@Controller
public class UserRegesteration {
	
	@GetMapping("regester")  //first the front controller will trigger this controller where we are calling userReg.jsp page.
	public ModelAndView showRegesterPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
	
	/*
	 * once we submint the form, value will be send in the form of request
	 * from jsp to post method as we have return the action in form tag.
	 * 
	 * here, @modelAttribute will convert the data in java object.
	 */
	
	@PostMapping("RegesterUser")
	public ModelAndView userRegester(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user",user);
		modelAndView.setViewName("regResult"); // here we are sending data again from contoller to UI on different page.
		return modelAndView;
	}
	
}
