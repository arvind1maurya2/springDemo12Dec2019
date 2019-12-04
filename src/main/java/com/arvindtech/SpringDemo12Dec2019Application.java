package com.arvindtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class SpringDemo12Dec2019Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo12Dec2019Application.class, args);
	}

}
