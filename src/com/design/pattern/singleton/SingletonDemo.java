package com.design.pattern.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		//Singleton obj=new Singleton();
		//obj.showMessage();
		
		Singleton obj = Singleton.getInstance();
		obj.showMessage();
		
		Singleton obj2 = Singleton.getInstance();
		obj.showMessage();
		
		if (obj == obj2) {
			System.out.println("both are same object");
		}else {
			System.out.println("different object");
		}
	}

}
