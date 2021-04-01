package com.nth.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
	@GetMapping("/new")
	public String ShowNew() {
		return "users/add-or-edit";
	}
}
