package com.cts.training.day21;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = -2348753160633337286L;

	public int id;
	String name;
	transient String address;
	String designation;
	transient int age;
	double salary;
	int phone;

	public Employee() {
	}

	public Employee(int id, String name, String address, String designation, int age, double salary, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return id + "  :  " + name + "  :  " + address + "  :  " + designation + "  :  " + age + "  :  " + salary
				+ "  :  " + phone;

	}

}
