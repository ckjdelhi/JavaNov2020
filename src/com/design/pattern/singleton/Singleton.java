package com.design.pattern.singleton;
/*
 * Eager Initialization Singleton class:
 * 1. create private constructor
 * 2. create private static variable of class type
 * 3. Initialize in static block
 * 4. create public static method to return the variable
 * 
 * Lazy Initialization Singleton class:
 * 1. create private constructor
 * 2. create private static variable of class type and initialize with null
 * 3. create public static method to return the variable only if object is not initialized.
 * 
 * 		1. Thread Safe Singleton class:
 * 			1. add synchronized modifier to getInstance method
 * 
 */
public class Singleton {

	private static Singleton obj = null;
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		if(obj == null)
			obj = new Singleton();
		return obj;
	}
	
	public void showMessage() {
		System.out.println("This is Singleton message");
	}
}
