package com.oops;

/*
 * Interface: 
 * 1. cannot create object of interface
 * 2. always have to 'implements' the interface
 * 3. all methods are by default 'public' and 'abstract'
 * 4. all variables are by default static and final
 * 5. Always have to override all the methods available in interface
 * 6. Interface supports multiple inheritance 
 * 7. can 'extends' another interface
 */
interface ITest{
	int num = 5; //public static final int num = 5
	void show();
	void display(); // public abstract void display();
}
interface ITest2  extends ITest{
	void insert();
}

public class InterfaceDemo implements ITest, ITest2{ //IS-A

	Employee e = new Employee(); //HAS-A
	public static void main(String[] args) {
		ITest obj=new InterfaceDemo();
		obj.show();
		obj.display();
		System.out.println(ITest.num);
		//obj.insert();
		
		ITest2 obj2 =new InterfaceDemo();
		obj2.insert();
		obj2.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

}
