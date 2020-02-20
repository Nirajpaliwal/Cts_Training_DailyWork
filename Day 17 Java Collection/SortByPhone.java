package com.cognizant.training.day17;

import java.util.Comparator;

public class SortByPhone implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {
		if (obj1.getPhone() > obj2.getPhone()) {
			return 1;
		} else if (obj1.getPhone() == obj2.getPhone()) {
			return 0;
		} else {
			return -1;
		}
	}

}
