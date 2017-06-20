package io.arukas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "message", defaultValue = "World") String message){
		return "Hello " + message;
	}

	@GetMapping(value = "/data")
	public Map<String, String> mapData(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("content", "hello spring boot");
		return map;
	}

}
