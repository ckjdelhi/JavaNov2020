package com.basic;

import com.oops.AccessModifiersDemo;

public class Demo3 extends AccessModifiersDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AccessModifiersDemo obj=new AccessModifiersDemo();
		Demo3 obj=new Demo3();
		
		//System.out.println(obj.name); //'default' access modifier can't be accessible outside of the package
		//System.out.println(obj.empId); // 'private' within the same class only
		System.out.println(obj.salary); // 'protected' accessible outside of the package only by creating inheritance
		System.out.println(obj.companyAddress); //'public'
	}

}
