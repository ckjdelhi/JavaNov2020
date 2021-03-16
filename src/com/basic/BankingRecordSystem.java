package com.basic;

import java.util.Scanner;

public class BankingRecordSystem {

	public static void main(String[] args) {
		int choice=1000;
		
		while(choice != 3) {
			System.out.println("***********Account Information System*******");
			System.out.println("Select one option below");
			System.out.println("\t 1. Add record");
			System.out.println("\t 2. Show record");
			System.out.println("\t 3. Quite");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice: ");
			choice= sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter Account Number: ");
				String accountNumber = sc.next();
				System.out.println("Enter First Name: ");
				String firstName = sc.next();
				break;
			case 2:
				System.out.println("Show record details");
				break;
			default:
				System.out.println("Please select right option");
				break;
			}
		}
	}
}
