package com.basic;

/*
 0 and 1 = binary digits (bit)
 0 or 1 = 1 bit
 8 bits = 1 bytes
 1024 bytes = 1 KB(kilo bytes)
 1024 KB = 1 MB
 1024 MB = 1 GB
 1024 GM = 1 TB
 */

//Static = 4+4+8+8 = 24 bytes 
//Total = 4 x 24 = 96  bytes
public class DataTypes {

	int a = 5; //4 bytes
	float b = 4.5F; //4 bytes
	double c = 4.0; //8 bytes
	long d = 80; //8 bytes 
	
	public static void main(String[] args) {
		DataTypes obj1= new DataTypes(); //24 bytes
		DataTypes obj2= new DataTypes(); //24 bytes
		DataTypes obj3= new DataTypes(); //24 bytes
		DataTypes obj4= new DataTypes(); //24 bytes
		
	}

}
