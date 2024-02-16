package com.hibernateconfiguration.javabased;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "Employee_Detail")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	
	@Column(name = "emp_name",nullable = false,length = 32)
	private String name;
	
	private double salary;
	
	private String email;
	
	@Temporal(TemporalType.DATE)
	private Date joiningDate;
	
	private boolean status;
	
	@Transient
	private String token;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int emp_id, String name, double salary, String email, Date joiningDate, boolean status,
			String token) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.joiningDate = joiningDate;
		this.status = status;
		this.token = token;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", salary=" + salary + ", email=" + email
				+ ", joiningDate=" + joiningDate + ", status=" + status + ", token=" + token + "]";
	}
	
	
	
	
	
	

}
