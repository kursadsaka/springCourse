package com.kursad.springboot.demo.mySpringbootApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kursad.springboot.demo.mySpringbootApp.common.Coach;
import com.kursad.springboot.demo.mySpringbootApp.common.SwimCoach;

@Configuration
public class SportConfig {

	@Bean
	public Coach swimCoach() {
		return new SwimCoach();
	}
}
