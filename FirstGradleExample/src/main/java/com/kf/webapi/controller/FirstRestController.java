package com.kf.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	@GetMapping("/sayBourne")
	public String welcome() {
		return "Hi User!!! Welcome to Bournemouth Sea Shore";
	}
	
	@GetMapping("/sayDover")
	public String getDover() {
		return "Hi User!!! Thanks for Visiting Dover Square";
	}
}
