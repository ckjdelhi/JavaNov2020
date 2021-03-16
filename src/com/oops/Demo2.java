package com.oops;

public class Demo2 {

	public static void main(String[] args) {
		AccessModifiersDemo obj=new AccessModifiersDemo();
		System.out.println(obj.name);
		//System.out.println(obj.empId);//private access modifier
		System.out.println(obj.salary);
		System.out.println(obj.companyAddress);

	}

}
