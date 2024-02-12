package com.kursad.springRestCrudApiWithDatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kursad.springRestCrudApiWithDatabase.dao.EmployeeDAO;
import com.kursad.springRestCrudApiWithDatabase.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	@Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}

	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(int id) {
		return employeeDAO.findById(id);
	}

	@Transactional
	@Override
	public Employee save(Employee theEmployee) {
		return employeeDAO.save(theEmployee);
	}

	@Transactional
	@Override
	public void deleteById(int id) {
		employeeDAO.deleteById(id);
	}

}
