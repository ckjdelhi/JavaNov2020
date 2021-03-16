package com.design.pattern.factory;

public class ShapeFactory extends AbstractFactory{

	@Override
	Color getColor(String type) {
		return null;
	}

	@Override
	Shape getShape(String type) {
		if(type == null)
			return null;
		else if(type.equalsIgnoreCase("circle"))
			return new Circle();
		else if(type.equalsIgnoreCase("rectange"))
			return new Rectange();
		else if(type.equalsIgnoreCase("square"))
			return new Square();
		return null;
	}

}
