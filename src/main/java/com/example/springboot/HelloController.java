package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot + Tanzu! landbank coffee 123";
	}
	@RequestMapping("/home")
	public String home() {
		return "Home suck";
	}
	@RequestMapping("/debug")
	public String debug1() {
		return "Home suck geniusddd000";
	}
}