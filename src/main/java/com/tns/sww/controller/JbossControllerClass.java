package com.tns.sww.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class JbossControllerClass {
	
	@Value("${message}")
	String messageFromConfig;
	
	@GetMapping("/demoEP")
	public String demoEndPoint() {
		System.out.println("Hiting the controller..!!!");
		return "RUNNING IN WILD FLY SERVER..! AND "+messageFromConfig;
	}
//	/SpringWithWildFly/src/main/resources/application.properties
}
