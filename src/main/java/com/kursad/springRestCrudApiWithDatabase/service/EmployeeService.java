package com.kursad.springRestCrudApiWithDatabase.service;

import java.util.List;

import com.kursad.springRestCrudApiWithDatabase.entity.Employee;

public interface EmployeeService {
	List<Employee> findAll();

	Employee findById(int id);

	Employee save(Employee theEmployee);

	void deleteById(int id);
}
