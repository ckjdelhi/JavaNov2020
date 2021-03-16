package com.immutableDemo;

public class Address implements Cloneable {
	private String cityName;

	public Address(String cityName) {
		this.cityName = cityName;
	}
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	@Override
	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}

}
