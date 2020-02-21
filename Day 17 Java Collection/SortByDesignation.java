package com.cognizant.training.day17;

import java.util.Comparator;

public class SortByDesignation implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {

		return obj1.getDesignation().compareTo(obj2.getDesignation());
	}
}
