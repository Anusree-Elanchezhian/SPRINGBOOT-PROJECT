package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class studentController {
	@GetMapping("/get")
	
	public studentResponse getStudent() {
		studentResponse studentResponse = new studentResponse(1,"John","Smith");
		return studentResponse;
	}

}