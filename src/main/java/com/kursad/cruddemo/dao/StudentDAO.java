package com.kursad.cruddemo.dao;

import com.kursad.cruddemo.entity.Student;

public interface StudentDAO {

	void save(Student theStudent);

	Student findById(Integer id);

}
