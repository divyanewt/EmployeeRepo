package com.newt.employeedetails.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="TBL_EMPLOYEE")
public class Employee {
	@Id
	@Column(name="ID")
	
	String id;
	
	@NotNull
	@Column(name="FIRST_NAME")
	String firstName;
	
	@NotNull
	@Column(name="LAST_NAME")
	String lastName;
	
	@Column(name="EMAILID")
	String emailId;
	
	@Column(name="PASSWORD")
	@NotNull
	String password;
	
	@Column(name="SUPERVISOR_ID")
	String supervisorID;
	
	
	@Column(name="TITLE")
	@NotNull
	String title;
	
	@Column(name="ONSHORE_RESOURCE")
	@NotNull
	String onShoreResource;
	
	@Column(name="JOIN_DATE")
	@NotNull
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	Date joinDate;
	
	@Column(name="RESIGNED_DATE")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	Date resginedDate;
	
	@Column(name="CREATE_DATE")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	@NotNull
	Date createDate;
	
	@Column(name="MODIFIED_DATE")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	@NotNull
	Date modifiedDate;
	
	@Column(name="MODIFIED_BY")
	@NotNull
	String modifiedBy;
	
	public Employee(){
		
		
	}

	public Employee(String id, String firstName, String lastName, String emailId, String password, String supervisorID,
			String title, String onShoreResource, Date joinDate, Date resginedDate, Date createDate, Date modifiedDate,
			String modifiedBy) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.supervisorID = supervisorID;
		this.title = title;
		this.onShoreResource = onShoreResource;
		this.joinDate = joinDate;
		this.resginedDate = resginedDate;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSupervisorID() {
		return supervisorID;
	}

	public void setSupervisorID(String supervisorID) {
		this.supervisorID = supervisorID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOnShoreResource() {
		return onShoreResource;
	}

	public void setOnShoreResource(String onShoreResource) {
		this.onShoreResource = onShoreResource;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Date getResginedDate() {
		return resginedDate;
	}

	public void setResginedDate(Date resginedDate) {
		this.resginedDate = resginedDate;
	}

	public Date getCreateDate() {
		
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		
		  this.createDate = createDate;
			}

	public Date getModifiedDate() {
		
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", password=" + password + ", supervisorID=" + supervisorID + ", title=" + title
				+ ", onShoreResource=" + onShoreResource + ", joinDate=" + joinDate + ", resginedDate=" + resginedDate
				+ ", createDate=" + createDate + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + "]";
	}
	
	

	
}
