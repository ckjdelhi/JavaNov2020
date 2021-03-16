package com.basic;

import java.util.Scanner;

/*
 Valid
 1. if
 2. if- else
 3. if- else if 
 4. if -else if - else if -else if
 5. if -else if - else
 
 Invalid
 1. else
 2. else if - else
 
 */
public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " is greater than "+ num2);
		}
		
		if(num1 > num2) {
			System.out.println("num1 is greater");
		}else {
			System.out.println("num2 is greater");
		}
		
		if(num1>num2) {
			
		}else if(num1 > 100) {
			
		}else if(num1 > 100) {
			
		}else if(num1 > 100) {
			
		}else if(num1 > 100) {
			
		}else if(num1 > 100) {
			
		}
		
		if(num1>num2) {
			
		}else if(num1 > 100) {
			
		}else if(num1 > 100) {
			
		}else if(num1 > 100) {
			
		}else if(num1 > 100) {
			
		}else if(num1 > 100) {
			
		}else {
			
		}
		

	}

}
