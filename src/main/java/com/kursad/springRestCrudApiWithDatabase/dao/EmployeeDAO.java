package com.kursad.springRestCrudApiWithDatabase.dao;

import java.util.List;

import com.kursad.springRestCrudApiWithDatabase.entity.Employee;

public interface EmployeeDAO {
	List<Employee> findAll();
}
