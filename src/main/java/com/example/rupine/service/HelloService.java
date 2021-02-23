package com.example.rupine.service;

import java.util.Random;

import org.springframework.stereotype.Service;
@Service
public class HelloService {
public String helloservice()
{
	Random r =new Random(1000);
	int random_number=r.nextInt();
	if(random_number>50)
	{
		return "Good Morning";
	}
	else
	{
		return "Good Evening";
		
	}
}
}
