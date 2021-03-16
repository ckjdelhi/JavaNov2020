package com.immutableDemo;

public class TestImmutableDemo{

	public static void main(String[] args) {
				
		Employee e1 =new Employee(100, "Chandan", new Address("delhi"));
		System.out.println(e1.getName() +"\t"+ e1.getAddress().getCityName());
		
		e1.getAddress().setCityName("Mumbai");
		System.out.println(e1.getName() +"\t"+ e1.getAddress().getCityName());
		
		//e1.setName("Rakesh");
		//e1.name ="Rakesh";
		
		//System.out.println(e1.getName());
		
		
		
				
		
	}
	
}
