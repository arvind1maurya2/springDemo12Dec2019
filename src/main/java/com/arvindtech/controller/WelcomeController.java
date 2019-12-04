package com.arvindtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WelcomeServiceOutOfMainPackage;
import com.arvindtech.service.WelcomeService;
 

@RestController
public class WelcomeController {

	@Autowired
	WelcomeService welcomeService;
	
	@Autowired
	WelcomeServiceOutOfMainPackage welcomeServiceOutOfMainPackage;
	
	@RequestMapping("/test-inside-package-autowiring-class")
	public String testAutowiringSubPackage() {
		return welcomeService.retrieveWelcomeMessage();
	}
	@RequestMapping("/test-outside-package-autowiring-class")
	public String testAutowiringOutsidePackage() {
		return welcomeServiceOutOfMainPackage.retrieveWelcomeMessage();
	}
}
