package com.exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Welcome");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num=0;
		try {
			num = sc.nextInt();
			
		} catch (Exception e) {
			System.out.println("Error occured while taking input from user, please enter valid number");
		}
		if(num != 0) {
			if(num % 2==0) {
				System.out.println(num +" is an even number");
			}else {
				System.out.println(num +" is an odd number");
			}
		}
		System.out.println("End of code");	

	}

}
