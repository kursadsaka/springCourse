package com.kursad.springboot.demo.mySpringbootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.kursad.springboot, com.kursad.util" })
public class MySpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringbootAppApplication.class, args);
	}

}
