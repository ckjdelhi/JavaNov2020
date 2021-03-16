package com.exception;

import java.util.Scanner;

/*
 * Valid cases
 * 1. try - catch
 * 2. try - catch - catch 0r multiple catch block
 * 3. try- catch -finally
 * 4. try - catch -catch -finally
 * 5. try - finally
 * 
 * InValid cases:
 * 1. only try
 * 2. only catch
 * 3. only finally
 * 4. catch-finally
 * 
 */
public class HandleExceptionDemo {
	static String str=null;
	
	public static void main(String[] args) {
		System.out.println("Enter any text:");
		Scanner sc=new Scanner(System.in);
		
		try {
			str = sc.nextLine();
			System.out.println("you have entered: "+str);
			
			System.out.println("your first name is: "+ str.substring(5, str.indexOf(" ")));
			
			char arr[]= str.toCharArray();
			System.out.println(arr[15]);
			
		}catch(StringIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}catch(IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("finally block");
			sc.close();
		}
		
		System.out.println("End of line");
	}

}
