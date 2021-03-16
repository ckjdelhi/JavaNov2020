package com.design.pattern.factory;

public class ColorFactory extends AbstractFactory {
	
	@Override
	public Color getColor(String colorType) {
		if(colorType == null)
			return null;
		else if(colorType.equalsIgnoreCase("red"))
			return new Red();
		else if(colorType.equalsIgnoreCase("blue"))
			return new Blue();
		else if(colorType.equalsIgnoreCase("white"))
			return new White();
		else
			return null;
	}

	@Override
	Shape getShape(String type) {
		return null;
	}

}
