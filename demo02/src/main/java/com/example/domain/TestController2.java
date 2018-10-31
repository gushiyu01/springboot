package com.example.domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
	
	@RequestMapping("/hehehe")
	public String hello(){
		return "hello springboot";
	}
}
