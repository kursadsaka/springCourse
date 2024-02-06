package com.kursad.springboot.demo.mySpringbootApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kursad.springboot.demo.mySpringbootApp.common.Coach;

@RestController
public class DemoController {
	private Coach myCoach;

	/*
	 * RECOMMENDED by the spring.io development team
	 * • Constructor Injection: required dependencies
	 * • Setter Injection: optional dependencies
	 * NOT RECOMMENDED by the spring.io development team
	 * • Field Injection -> In general, it makes the code harder to unit test
	 */

	@Autowired
	public DemoController(@Qualifier("swimCoach") Coach theCoach) {
		System.out.println("In constructor: " + getClass().getSimpleName());
		myCoach = theCoach;
	}

	// @Autowired
	// // public void doSomething(Coach theCoach) { // method name can be anything
	// public void setCoach(Coach theCoach) {
	// myCoach = theCoach;
	// }

	// Field injection example
	// @Autowired
	// private Coach myCoach;

	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
}
