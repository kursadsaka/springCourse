package com.kursad.cruddemo;

import java.util.List;

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
			// createStudent(studentDAO);

			// readStudent(studentDAO);

			queryForStudents(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object....");
		Student temStudent = new Student("Paul", "Doe", "kursad@me");

		System.out.println("Saving the student....");
		studentDAO.save(temStudent);

		System.out.println("Saved student. Generated id: " + temStudent.getId());
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object....");
		Student temStudent = new Student("A", "B", "ab@me");

		System.out.println("Saving the student....");
		studentDAO.save(temStudent);

		int theId = temStudent.getId();
		System.out.println("Saved student. Generated id: " + theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);
		// display student
		System.out.println("Found the student: " + myStudent);
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.FindAll();

		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}
}
