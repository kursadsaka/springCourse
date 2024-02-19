package com.kursad.springMvcWithThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

	@GetMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@GetMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormV2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		name = name.toUpperCase();

		String message = "Yo! " + name;

		model.addAttribute("message", message);

		return "helloworld";
	}

	@RequestMapping("/processFormV3")
	public String processFormV3(@RequestParam("studentName") String name, Model model) {
		String message = "Yo3! " + name.toUpperCase();
		model.addAttribute("message", message);

		return "helloworld";
	}

}
