package com.nth.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("")
	public String ShowForm() {
		return "student-form";
	}
	
	@PostMapping()
	public String ShowInfo(HttpServletRequest request, ModelMap model) {
		String name = request.getParameter("name");
		String gpa = request.getParameter("gpa");
		String major = request.getParameter("major");
		
		model.addAttribute("name",name);
		model.addAttribute("gpa",gpa);
		model.addAttribute("major",major);
		return "student-info";
	}
}
