package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;


public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDAOImpl empObj = new EmployeeDAOImpl();
		Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
		empObj.addEmployee(emp);
		
		//System.out.println("Enter employee id to be deleted : ");
		Scanner sc = new Scanner(System.in);
		//int emp_id = sc.nextInt();
		
//		empObj.deleteEmployee(emp_id);
		
		//Employee e = empObj.getEmployeeById(emp_id);
		
		//Employee e2 = empObj.updateEmployee(emp_id);
		
		
		//List<Employee> list = empObj.getAllEmployees();
		//list.forEach(System.out::println);
		
		
		System.out.println("-------- Employee Management -------------");
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Rename Employee");
		System.out.println("4. Get Employee By Id");
		System.out.println("5. Display All");
		System.out.println("6. Exit");
		int choice;
		
		do {
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
			}
		}while(choice != 6);
		
		
		
		
		
		
		
		
	}

}

