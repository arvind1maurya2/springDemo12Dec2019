package com;

import org.springframework.stereotype.Component;

@Component
public class WelcomeServiceOutOfMainPackage {

	public String retrieveWelcomeMessage() {
		return " this is Method of welcome service class which is situated in out side of main package";
	}
}
