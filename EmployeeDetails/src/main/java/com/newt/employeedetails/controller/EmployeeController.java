package com.newt.employeedetails.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newt.employeedetails.model.Employee;
import com.newt.employeedetails.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/getAllEmployee",method = RequestMethod.GET, produces = "application/json")
	 public List<Employee> getAllEmployee(){
		List<Employee>employeeList=employeeService.getAllEmployee();
		return  employeeList;
		
	}
	@RequestMapping(value="/getEmployeeById/{empId}",method = RequestMethod.GET, produces = "application/json")
	 public Employee getAllEmployee(@PathVariable("empId")String id){
		Employee getemployee=employeeService.getEmployeeById(id);
		return getemployee;
		
	}
	
	@RequestMapping(value="/getEmployeeBySupervisorId/{supervisorName}",method = RequestMethod.GET)
	 public List<Employee> getSupervisorName(@PathVariable("supervisorName")String id){
		return employeeService.getEmployeeBySupervisorId(id);
		
	}
	
	@RequestMapping(value="/searchEmployee/{searchName}",method = RequestMethod.GET,produces = "application/json")
	 public List<Employee> getEmployee(@PathVariable("searchName")String keyword){
		List<Employee> getEmployee=employeeService.searchEmpDetais(keyword);
		
		return getEmployee;
	}
	
	
	@RequestMapping(value="/getAllEmployeeNameBySupervisorId/{supervisorId}",method = RequestMethod.GET, produces = "application/json")
	 public List<Employee> getAllEmployeeBySupervisorId(@PathVariable("supervisorId") String id){
		List<Employee>employeeList=employeeService.getAllEmployeeBySupervisorId(id);
		List<String>empName = new ArrayList<String>();
		Iterator<Employee> iterator = employeeList.iterator();
		while (iterator.hasNext()) {
			Employee employee1=iterator.next();
			empName.add(employee1.getFirstName());
			
		}
		return  employeeList;
		
	}
	
	@RequestMapping(value="/addEmployee", method= RequestMethod.POST, produces="application/json")
	 public Employee addEmployee(@RequestBody Employee employee){
		Calendar cal=Calendar.getInstance();
		Date currentDate=cal.getTime();
		employee.setCreateDate(currentDate);
		employee.setModifiedDate(currentDate);
		Employee addemployee=employeeService.addEmployee(employee);
		return addemployee;
		
	}
	@RequestMapping(value="/updateEmployee", method= RequestMethod.PUT, produces="application/json")
	 public Employee updateEmployee(@RequestBody Employee employee){
		Calendar cal=Calendar.getInstance();
		Date currentDate=cal.getTime();
		employee.setModifiedDate(currentDate);
		Employee updateemployee=employeeService.updateEmployee(employee);
		return updateemployee;
		
	}
	
	@RequestMapping(value="/deleteEmployee/{empId}", method= RequestMethod.DELETE)
	 public String  deleteEmployee(@PathVariable("empId")String id){
		employeeService.deleteEmployee(id);
		return "deleted successfully";
		
		
	}

}
