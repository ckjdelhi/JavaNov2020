package com.basic;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctrl + shift+ o
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Case 1 block");
			break;
		case 2: 
			System.out.println("Case 2 block");
			break;
		case 3: 
			System.out.println("Case 3 block");
			break;
		case 4: 
			System.out.println("Case 4 block");
			break;
		case 5: 
			System.out.println("Case 5 block");
			break;
		default:
			System.out.println("Default");
		}
	}

}
