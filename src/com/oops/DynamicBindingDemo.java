package com.oops;

class Parent1 {
	void show() {
		System.out.println("P: show");
	}
	void display() {
		System.out.println("P: display");
	}
}
class Child1 extends Parent1{
	void insert() {
		System.out.println("C: insert");
	}
	void show() {
		System.out.println("C: Show");
	}
}

public class DynamicBindingDemo {

	public static void main(String[] args) {
		
		Parent1 obj= new Parent1();
		obj.show();
		
		Child1 obj2=new Child1();
		obj2.insert();
		obj2.show();

		Parent1 obj3 = new Child1();
		//obj3.insert();
		obj3.show();
		obj3.display();
	}

}
