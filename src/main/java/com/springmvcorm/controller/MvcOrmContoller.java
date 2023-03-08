package com.springmvcorm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcorm.entity.User;
import com.springmvcorm.service.UserService;

@Controller
public class MvcOrmContoller {
	
	@Autowired
	public UserService userService;

	@GetMapping("regesterContoller")  //first the front controller will trigger this controller where we are calling userReg.jsp page.
	public ModelAndView showRegesterPage1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
	
	@PostMapping("RegesterUser1")
	public ModelAndView userRegester1(@ModelAttribute("user") User user) {
		ModelAndView modelAndView = new ModelAndView();
		int result = userService.save(user);
		modelAndView.addObject("result","User created with id "+user.getId());
		modelAndView.setViewName("userReg"); // here we are sending data again from contoller to UI on different page.
		return modelAndView;
	}
	
	@GetMapping("allusers")
	public ModelAndView allUsers() {
		ModelAndView modelAndView = new ModelAndView();
		List<User> users = userService.allUser();
		modelAndView.addObject("users",users);
		modelAndView.setViewName("showusers");
		return modelAndView;
	}
	
}
