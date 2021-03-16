package com.basic;
//static block -> main -> init block -> constructor -> normal method
public class StaticDemo {
	static {
		System.out.println("1");
	}
	
	public StaticDemo() {
		System.out.println("5");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome");
		StaticDemo obj = new StaticDemo();
		StaticDemo obj2 = new StaticDemo();
	}
	
	static {
		System.out.println("2");
	}
	{
		//init block
		System.out.println("3");
	}
	
	{
		System.out.println("4");
	}

}
