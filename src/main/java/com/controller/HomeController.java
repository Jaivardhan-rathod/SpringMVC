package com.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	@GetMapping("home")
	public ModelAndView home() {
		System.out.println("get controller");
		return new ModelAndView("home");
	}
	
	@GetMapping("data")
	public ModelAndView dataFromController(Model model) {
		model.addAttribute("name", "Jaivardhan"); // send data to view using model.
		model.addAttribute("id",01);
		
		List<String> emp = new ArrayList<String>();
		emp.add("emp 1");
		emp.add("emp 2");
		emp.add("emp 3");
		emp.add("emp 4");
		
		model.addAttribute("emp", emp);
		
		return new ModelAndView("data");
	}
	
	@GetMapping("/about")
	public ModelAndView about() {
		System.out.println("in about page");
		return new ModelAndView("about");
	}
	
	@GetMapping("/help")
	public ModelAndView help() {
		System.out.println("in help controller");
		ModelAndView modelAndView = new ModelAndView(); // we can provide view name with saperate method setViewName("page name")
		
		modelAndView.addObject("Time",LocalDateTime.now());
		modelAndView.addObject("HelpNo", "121211");
		
		List<String> days = new ArrayList<String>();
		days.add("mon");
		days.add("tue");
		days.add("wed");
		
		modelAndView.addObject("days",days);
		modelAndView.setViewName("help");
		return modelAndView;
	}
	

}
