package com.newt.employeedetails.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newt.employeedetails.model.Employee;
import com.newt.employeedetails.repository.EmployeeRepository;


@Service
@Transactional
public class EmployeeServiceImple implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRep;

	public List<Employee> getAllEmployee() {
		
		return  employeeRep.findAll();
	}

	public Employee addEmployee(Employee employee) {
		return employeeRep.save(employee);
	}

	public Employee getEmployeeById(String id) {
		return employeeRep.findOne(id);
	}

	public Employee updateEmployee(Employee employee) {
		return employeeRep.save(employee);
	}

	public void deleteEmployee(String id) {
		employeeRep.delete(id);
	}

	public List<Employee> getAllEmployeeBySupervisorId(String id) {
		return employeeRep.findBySupervisorID(id);
	}

	public Employee getSupervisorName(String id) {
		return employeeRep.findOne(id);
		
	}

	public List<Employee> searchEmpDetais(String keyword) {
		// TODO Auto-generated method stub
		return employeeRep.searchEmployee(keyword);
	}

	@Override
	public List<Employee> getEmployeeBySupervisorId(String id) {
		// TODO Auto-generated method stub
		
		return employeeRep.findBySupervisorID(id);
	}

}
