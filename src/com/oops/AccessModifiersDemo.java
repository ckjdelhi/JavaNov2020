package com.oops;

/*
 * Default: 
 * 1. within same class, 2. within same package
 * 
 * private:
 * 1. within same class only
 */

public class AccessModifiersDemo {

	String name ="ABC"; //default 
	private int empId = 12345; //private
	protected double salary = 500000d; //protected
	public String companyAddress = "India"; //public
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiersDemo obj=new AccessModifiersDemo();
		
		System.out.println(obj.name);
		System.out.println(obj.empId);
		System.out.println(obj.salary);
		System.out.println(obj.companyAddress);
	}

}
