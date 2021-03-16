package com.exception;

import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args){
		System.out.println("Enter you age: ");
		Scanner sc=new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			validateAge(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}

	private static void validateAge(int age) throws InvalidAgeException {
		if(age<0) {
			throw new InvalidAgeException("Age is not valid");
		}else if (age<18) {
			throw new InvalidAgeException("You are not allowed to vote");
		}else {
			System.out.println("you are allowed to vote");
		}
	}

}
