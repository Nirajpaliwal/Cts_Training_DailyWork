// program to demonstrate use of getter and setter method
package com.sample;

class EmployeeDetails{
	private double salary = 10000;
	private String designation = "PAT";
	private int age = 22;
	
	//getter method
	public double getSalary() {
		return salary;
	}
	
	// setter method
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//getter method
	public String getDesignation() {
		return designation;
	}	
	
	// setter method
	public void setDesignation(String designation) {
		designation = designation;
	}
	
	//getter method
	public int getAge() {
		return age;
	}
	
	// setter method
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class getterSetterExample {

	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		
		System.out.println("Before salary = " + e.getSalary());
		System.out.println("Before Designation = " + e.getDesignation());
		System.out.println("Before Age = " + e.getAge());
		
		e.setAge(20);
		e.setDesignation("ET");
		e.setSalary(21700);
		
		System.out.println("-----------");
		System.out.println("After salary = " + e.getSalary());
		System.out.println("After Designation = " + e.getDesignation());
		System.out.println("After Age = " + e.getAge());
		

	}

}
