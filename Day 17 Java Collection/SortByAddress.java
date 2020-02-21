package com.cognizant.training.day17;

import java.util.Comparator;

public class SortByAddress implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {

		return obj1.getAddress().compareTo(obj2.getAddress());
	}

}
