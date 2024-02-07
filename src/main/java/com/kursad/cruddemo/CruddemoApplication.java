package com.kursad.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kursad.cruddemo.dao.StudentDAO;
import com.kursad.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object....");
		Student temStudent = new Student("Paul", "Doe", "kursad@me");

		System.out.println("Saving the student....");
		studentDAO.save(temStudent);

		System.out.println("Saved student. Generated id: " + temStudent.getId());
	}
}
