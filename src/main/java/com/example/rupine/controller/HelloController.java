package com.example.rupine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rupine.service.HelloService;

@RestController
public class HelloController {
	@Autowired
HelloService hs;
	@GetMapping("/welcome")
	public String hello()
	{
		return hs.helloservice();
	}
}
