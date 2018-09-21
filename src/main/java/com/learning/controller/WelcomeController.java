package com.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/com/demo")
	public String welcome() {
		return "Welcome to SpringBoot";
	}

}
