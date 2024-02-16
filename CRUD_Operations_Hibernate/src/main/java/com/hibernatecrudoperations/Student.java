package com.hibernatecrudoperations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll_number;
	
	private String name;
	
	private String address;
	
	private String email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll_number, String name, String address, String email) {
		super();
		this.roll_number = roll_number;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public int getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + ", address=" + address + ", email=" + email
				+ "]";
	}
	
	

}
