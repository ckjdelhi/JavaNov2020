package com.design.pattern.factory;

import java.util.Scanner;

public class FactoryDesignPatternDemo {

	public static void main(String[] args) {
		
		/*Color o= new Red();
		o.fillColor();
		
		Color o2= new Blue();
		o2.fillColor();
		
		Color o3= new White();
		o3.fillColor();

		//----------------------
		
		ColorFactory obj=new ColorFactory();
		
		Color c1=obj.getColor("red");
		c1.fillColor();
		
		Color c2=obj.getColor("blue");
		c2.fillColor();
		
		Color c3=obj.getColor("white");
		c3.fillColor();
		
		//--------------
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter class name to get the object:");
		String className=sc.next();
		
		Color color= obj.getColor(className);
		if(color == null) {
			System.out.println("Not valid class name");
		}else {
			color.fillColor();
		}
		*/
		
		AbstractFactory factory = new ShapeFactory();
				
		Shape shape = factory.getShape("circle");
		shape.getShape();
		
		factory= new ColorFactory();
		Color color = factory.getColor("red");
		color.fillColor();
		
	}

}
