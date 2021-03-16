package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException{
	
		File f=new File("abc.txt");
		OutputStream is =new FileOutputStream(f);
		
		

	}

}
