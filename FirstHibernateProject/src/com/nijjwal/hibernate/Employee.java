package com.nijjwal.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEE_INFO")
public class Employee {

	@Id
	private int employeeId;

	@Column(name = "EMPLOYEE_FULL_NAME", nullable = false)
	private String employeeName;

	@Transient
	private String employeePhoneNum;

	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePhoneNum() {
		return employeePhoneNum;
	}

	public void setEmployeePhoneNum(String employeePhoneNum) {
		this.employeePhoneNum = employeePhoneNum;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
