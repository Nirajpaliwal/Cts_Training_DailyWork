package com.cognizant.training.day17;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		addEmployees(list);

		SortById sort_by_id = new SortById();
		// SortByAge sort_by_age = new SortByAge();
		// SortByPhone sort_by_phone = new SortByPhone();
		// SortByName sort_by_name = new SortByName();
		// SortByAddress sort_by_address = new SortByAddress();
		// SortByDesignation sort_by_designation = new SortByDesignation();

		Collections.sort(list, sort_by_id);

		// System.out.println(list);

		for (Employee emp : list) {
			System.out.println(emp);
		}

	}

	private static void addEmployees(ArrayList<Employee> list) {
		Employee emp1 = new Employee(1006, "Ravi", "Pune", "Developer", 22, 28200.43, 34875479L);
		Employee emp2 = new Employee(1003, "Mohan", "Mumbai", "Tester", 32, 44211.43, 424334534L);
		Employee emp3 = new Employee(1005, "Ram", "Pune", "Software Engineer", 27, 33200.43, 23433455L);
		Employee emp4 = new Employee(1002, "Shyam", "Delhi", "PAT", 25, 22300.43, 32233231L);
		Employee emp5 = new Employee(1004, "Vijay", "Banglore", "Developer", 24, 32444.43, 24332321L);

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
	}

}
