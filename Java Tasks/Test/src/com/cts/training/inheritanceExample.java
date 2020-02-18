package com.cts.training;

class Employee {
	 String name = "Neeraj";
	 int emp_id = 12345;
	 String designation = "Programmer Analyst Trainee";
	 String address = "Pune";
	 int phone_no = 1234567890;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

}

class Salary extends Employee{
	double da, hra, pf;
	double net_pay = 0.00;
	double basic_pay = 10000;
	double gross_pay = 0.00;
	double income_tax = 0.00;
	
	double calculations(){
		da = 0.30 * basic_pay;
		hra = 12.5 * basic_pay;
		pf = 0.12 * basic_pay;
		gross_pay = basic_pay + da + hra;
		net_pay = gross_pay - pf;
		return net_pay;
	}
	
	void dispaly() {
		Employee emp = new Employee();
		
		double total_salary = calculations();
		
		System.out.println("Employee Name : " + emp.getName());
		System.out.println("Employee Id : " + emp.getEmp_id());
		System.out.println("Employee Designation : " + emp.getDesignation());
		System.out.println("Employee Address : " + emp.getAddress());
		System.out.println("Employee Phone No : " + emp.getPhone_no());
		System.out.println("Employee Salary : " + total_salary);
	}
}

public class inheritanceExample {

	public static void main(String[] args) {
		Salary sal = new Salary();
		sal.dispaly();

	}

}
