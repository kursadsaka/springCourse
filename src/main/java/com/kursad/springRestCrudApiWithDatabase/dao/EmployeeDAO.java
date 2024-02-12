package com.kursad.springRestCrudApiWithDatabase.dao;

import java.util.List;

import com.kursad.springRestCrudApiWithDatabase.entity.Employee;

public interface EmployeeDAO {
	List<Employee> findAll();

	Employee findById(int id);

	Employee save(Employee theEmployee);

	void deleteById(int id);
}
