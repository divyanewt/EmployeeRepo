package com.newt.employeedetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.newt.employeedetails.model.Employee;


@Repository

public interface EmployeeRepository extends JpaRepository<Employee,String>{
	public long count() ;
	public List<Employee> findAll() ;
	public void delete(String id);
	public Employee findOne(String id);
	public <S extends Employee> List<S> save(List<S> employee) ;
	public List<Employee> findBySupervisorID(String id);
	 
	@Query(value="select * from tbl_employee e where e.id like ?1 or e.first_name like ?1 or e.last_name like ?1", nativeQuery=true)
	public List<Employee> searchEmployee(String keyword);

}
 