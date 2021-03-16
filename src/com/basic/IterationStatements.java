package com.basic;

public class IterationStatements {

	public static void main(String[] args) {
		int num=1;
		/*while(num<=10) {
			System.out.println(num);
			num++;
		}*/
		
		/*do {
			System.out.println(num);
			num++;
		}while(num<=10);*/
		
		
		/*for(num=1;num<=10;num++) {
			System.out.println(num);
		}*/
		
		for(int i=1; i<=100;i++) {
			if(i % 2 == 1) {
				continue;
				//break;
			}
			System.out.println(i);
		}
		
		int res = new IterationStatements().addNumber(20, 30);
		System.out.println(res);

	}
	
	int addNumber(int a, int b) {
		return a+b;
	}

}
