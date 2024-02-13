package com.kursad.springRestCrudApiWithDatabase.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kursad.springRestCrudApiWithDatabase.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
