package io.arukas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo01 {

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "message", defaultValue = "World") String message){
		return "Hello " + message;
	}
	
}
