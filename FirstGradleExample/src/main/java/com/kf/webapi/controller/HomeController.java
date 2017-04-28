package com.kf.webapi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//inject from application.properties file
	@Value("${webapi.home.message:test}")
	private String message = "Hello World";

	@RequestMapping("/sayHello")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcomePage";
	}
}
