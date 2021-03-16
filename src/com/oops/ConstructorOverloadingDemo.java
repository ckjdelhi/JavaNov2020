package com.oops;

class Test{
	public Test() {
		this(20);
		System.out.println("Hi");
	}
	public Test(int a){
		System.out.println("Hi 1");
	}
	public Test(String s){
		this();
		System.out.println("Hi 2");
	}
}

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		//Test obj = new Test("chandan");
		
		//Test obj1 = new Test();
		
		Test obj2 = new Test(20);
		
	}

}
