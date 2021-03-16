package com.immutableDemo;
/*
 * 1. Remove setter method
 * 2. Make class as final
 * 3. Make all variables as private and final
 * 4. if we have mutable reference in class then return clone object or perform deep cloning inside getter method
 */
public final class Employee{
	private final int empId;
	private final String name;
	
	private final Address address;
	
	public Employee(int empId, String name, Address address) {
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		//Deep cloning
		//Address newAddress = new Address(this.address.getCityName());
		//return newAddress;
		
		//Shallow cloning
		Address a=null;
		try {
			a = address.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
}
