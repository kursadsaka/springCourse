package com.kursad.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kursad.demo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> theStudents = new ArrayList<>();

		theStudents.add(new Student("Q", "S"));
		theStudents.add(new Student("Tim", "Sah"));
		theStudents.add(new Student("Anka", "Ra"));

		return theStudents;
	}

}
