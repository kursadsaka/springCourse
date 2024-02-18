package com.kursad.springboot.demo.mySpringbootApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@Value("${coach.name}")
	private String coachName;
	@Value("${team.name}")
	private String teamName;

	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}

	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run 5k!";
	}

	@GetMapping("/fortune")
	public String ge() {
		return "Today is your lucky day.";
	}

	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + ", Team name: " + teamName;
	}

}
