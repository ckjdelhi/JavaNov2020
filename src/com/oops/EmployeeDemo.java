package com.oops;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Chandan", "Kumar", 123, 50000);
		System.out.println(e1);
		
		Employee e2 = new Employee("Rakesh", "Kumar", 124, 150000);
		
		Employee e3 = new Employee();
		e3.setFirstName("Amit");
		e3.setLastName("Singh");
		e3.setEmpId(125);
		e3.setSalary(10000);
		
		
		Employee arr[] =new Employee[3];
		arr[0]=e1;
		arr[1]=e2;
		arr[2]=e3;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getFirstName() +"\t"+arr[i].getLastName() +"\t"+arr[i].getEmpId() +"\t"+arr[i].getSalary());
		}
		
		

	}

}
