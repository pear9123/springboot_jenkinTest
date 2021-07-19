package com.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exController {

	@GetMapping("/")
	public String home() {
		return "hello world";
	}
}
