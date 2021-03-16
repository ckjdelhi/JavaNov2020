package com.finalDemo;
/*
 * final with Class: that class cannot be extended
 * final with method: that method cannot be overridden
 * final with variable: that variable cannot be modified
 * 
 * 
 * 
 * 
 */

final class Test{
	final int num; 
	public Test(int a) {
		this.num = a;
	}
	int num2 = 10;
	final void show() {
		System.out.println("show");
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		Test obj = new Test(200);
		obj.num2 = obj.num + obj.num2;
		//obj.num = 300;
		
		System.out.println(obj.num2);
		obj.show();
	
	}
	

}
