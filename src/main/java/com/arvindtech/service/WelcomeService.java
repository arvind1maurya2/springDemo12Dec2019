package com.arvindtech.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

	public String retrieveWelcomeMessage() {
		return " this is Method of welcome service class which is situated in chield package of main package";
	}
}
