package com.oops;
/*
 * This is a POJO class (Plain Old Java Object)
 * 1. all variables should be private
 * 2. Add default and parameterized constructor 
 * 3. Add getter and setter methods
 * 4. Override toString() method
 * 5. implement Comparable interface
 * 6. Override compareTo method for default sorting
 */
public class Employee implements Comparable<Employee>{
	private String firstName;
	private String lastName;
	private int empId;
	private double salary;
	
	public Employee() {}

	public Employee(String firstName, String lastName, int empId, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId + ", salary=" + salary
				+ "]";
	}

	@Override
	public int compareTo(Employee obj) {
		//return (int) (this.salary - obj.salary);
		//return this.firstName.compareToIgnoreCase(obj.firstName);
		return this.empId - obj.empId;
	}
	
	
}
