package com.example.demo02;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController1 {
	
	@RequestMapping("/hehe")
	public String hello(){
		return "hello springboot";
	}
}
