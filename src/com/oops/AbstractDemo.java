package com.oops;
/*
 * Abstract Class
 * 1. Cannot create object or can't be instantiated 
 * 2. Always we have to 'extends' the class
 * 3. Abstract class can have abstract method and concrete method as well
 * 4. Abstract method must be overridden by child class
 */
//50% abstraction
abstract class Testing{
	
	public Testing() {
		System.out.println("Const");
	}
	
	public Testing(int a) {
		System.out.println("Const-2");
	}
	//concrete method
	void show() {
		System.out.println("Showing");
	}
	void display() {
		System.out.println("displaying");
	}
	//abstract method
	abstract void insert();
	abstract int delete();
}

public class AbstractDemo extends Testing{
	
	public AbstractDemo() {
		super(200);
	}

	public static void main(String[] args) {
		//Testing obj=new Testing();
		AbstractDemo obj=new AbstractDemo();
		obj.show();
		obj.display();
		obj.delete();
	}

	@Override
	int delete() {
		System.out.println("My delete");
		return 0;
	}

	@Override
	void insert() {
		// TODO Auto-generated method stub
		
	}

}
