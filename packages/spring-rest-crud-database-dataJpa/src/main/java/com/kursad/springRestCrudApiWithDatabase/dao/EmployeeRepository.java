package com.kursad.springRestCrudApiWithDatabase.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kursad.springRestCrudApiWithDatabase.entity.Employee;

@RepositoryRestResource(path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
