package com.oops;

class Parent{
	void show(int a) throws IndexOutOfBoundsException{
		System.out.println("P:show");
	}
}

class Child extends Parent {
	void show(int a) throws StringIndexOutOfBoundsException{
		System.out.println("c: show int");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.show(200);
	}

}
