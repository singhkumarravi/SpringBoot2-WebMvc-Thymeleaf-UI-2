package com.olive.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.olive.model.Employee;

@Controller
public class TestController {
	
	
	@GetMapping("/")
	public String show(Model model) {
		System.out.println(" calling method...........");
		return "home";
	}

	
	@GetMapping("/msg")
	public String showMsg(Model model) {
		
		List<Employee> list=Arrays.asList(
				new Employee(10, "A", 20200.0),
				new Employee(20, "B", 444.4),
				new Employee(30, "C", 444.4),
				new Employee(40, "D", 444.4)
				);
		model.addAttribute("emp",list);
		return "msg";
	}

}
