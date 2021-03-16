package com.oops;

class BaseClass {
	public BaseClass() {
		System.out.println("B: constructor");
	}
	int age=20;
	void show() {
		System.out.println("P: show");
	}
}
class IntermediateClass extends BaseClass{
	public IntermediateClass() {
		System.out.println("I: constructor");
	}
	void insert() {
		System.out.println("I: insert");
	}
}
class DerivedClass extends IntermediateClass{
	public DerivedClass() {
		System.out.println("D: construtor");
	}
	void display() {
		System.out.println("D: display");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		/*BaseClass b=new BaseClass();
		b.show();
		System.out.println(b.age);*/
		
		System.out.println("------------------");
		
		/*IntermediateClass i =new IntermediateClass();
		i.insert();
		i.show();
		System.out.println(i.age);*/
		
		DerivedClass d = new DerivedClass();
		d.display();
		d.insert();
		d.show();
		System.out.println(d.age);
	}

}
