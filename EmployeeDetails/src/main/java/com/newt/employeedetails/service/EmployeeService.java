package com.newt.employeedetails.service;

import java.util.List;

import com.newt.employeedetails.model.Employee;


public interface EmployeeService {
	 public List<Employee> getAllEmployee() ;
	 public Employee addEmployee(Employee employee);
	 public Employee getSupervisorName(String id);
	 public List<Employee> getAllEmployeeBySupervisorId(String id) ;
	 public Employee getEmployeeById(String id);
	 public Employee updateEmployee(Employee employee);
	 public void deleteEmployee(String id);
	 public List<Employee>getEmployeeBySupervisorId(String id);
	 public List<Employee> searchEmpDetais(String keyword);
	

}
