package com.kf.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	@GetMapping("/sayBourne")
	public String welcome() {
		System.out.println("Inside in sayHello....in Docker ...Go..Hurry...!!!");
		return "Hi User!!! Welcome to Bournemouth Sea Shore";
	}
	
	@GetMapping("/sayDover")
	public String getDover() {
		System.out.println("Inside Dover.........in Docker");
		return "Hi User!!! Thanks for Visiting Docker Dover Square...................";
	}
}
