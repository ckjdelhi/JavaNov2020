package com.design.pattern.factory;

public abstract class AbstractFactory {
	abstract Color getColor(String type);
	abstract Shape getShape(String type);
}
