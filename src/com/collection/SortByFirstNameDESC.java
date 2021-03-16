package com.collection;

import java.util.Comparator;

import com.oops.Employee;

public class SortByFirstNameDESC implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getFirstName().compareToIgnoreCase(o1.getFirstName());
	}

}
