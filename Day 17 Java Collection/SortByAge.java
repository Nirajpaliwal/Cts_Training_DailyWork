package com.cognizant.training.day17;

import java.util.Comparator;

public class SortByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {
		if (obj1.getAge() > obj2.getAge()) {
			return 1;
		} else if (obj1.getAge() == obj2.getAge()) {
			return 0;
		} else {
			return -1;
		}
	}

}
