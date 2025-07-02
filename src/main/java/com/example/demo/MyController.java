package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	MyRepo repo;
	@GetMapping("/home")
	public String show()
	{
		return "home is running";
	}

}
