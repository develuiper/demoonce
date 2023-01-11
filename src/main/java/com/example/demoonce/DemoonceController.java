package com.example.demoonce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoonceController {
	@GetMapping("/check")
	public String hola() {
		return "estamos en la nubexx-check 10 controller"; 		
	}
	
	@GetMapping("/")
	public String ola() {
		return "estamos en la nubexx-15 controller"; 		
	}
}
