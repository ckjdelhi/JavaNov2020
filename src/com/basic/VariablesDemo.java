package com.basic;

public class VariablesDemo {
	int a = 5;
	static int b = 5;
	
	public static void main(String[] args) {
		VariablesDemo o1 = new VariablesDemo();
		o1.a = 10;
		o1.b = 20;
		
		VariablesDemo o2 = new VariablesDemo();
		o2.a=30;
		o2.b=50;
		
		System.out.println("a ="+o1.a +"\t b="+o1.b);
		System.out.println("a ="+o2.a +"\t b="+o2.b);
		
	}

}
