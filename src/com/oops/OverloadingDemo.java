package com.oops;

/*
 * show()
 * show(int a)
 * show(int a, int b)
 * show(float a)
 * show(int a, float b)
 * 
 */
public class OverloadingDemo {

	public static void main(String[] args) {
		OverloadingDemo obj=new OverloadingDemo();
		if(null == null) {
			System.out.println("hi");
		}
	}
	
	
	void show(Object o) {
		System.out.println("Hi2");
	}
	void show(String s) {
		System.out.println("Hi1");
	}
	void show(Integer i) {
		
	}
}
