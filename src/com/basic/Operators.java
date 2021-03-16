package com.basic;

public class Operators {

	public static void main(String[] args) {
		//int a=10, b=20;
		//Arithmetic Operator (+, -, *, /, %)
		//System.out.println(a - b);
		//System.out.println(a % b);//10
		
		//Unary Operator(+, -, ++(pre/post), --(pre/post))
		//int a = 5; 
		//System.out.println(a++ + ++a + a--); //5 + 7 + 7 = 19
		//int b = a++;
		//++a;
		//System.out.println(a+b);//  7+5
		
		//Relational Operator (>, <, >=, <=, !=, ==) returns boolean value
		//int a = 5, b=6;
		//System.out.println(!(a != b));//false
		
		//Logical Operator (&&, !!, !) returns boolean value
		//System.out.println(a>b || a>4);
		/*
		 &&
		 T && T = T
		 T && F = F
		 F && T = F
		 F && F = F
		 */
		/*
		 ||
		 T || T = T
		 T || F = T
		 F || T = T
		 F || F = F
		 */
		/*String s=null;
		if(s==null || s.length() == 0) {
			System.out.println("Null Value");
		}else {
			System.out.println("Not Null Value");
		}*/
		
		//Ternary Operator (condition?true statement:false statement)
		//int a=5, b=13;
		//System.out.println(a>b?"A is greater than B":"B is greater than A");
		
		//Bitwise Operator(&, |)
		//int a =5;
		//System.out.println(a | 3); //7
		/*
		 0 1 0 1
		&0 0 1 1
		 ----------
		 0 1 1 1
		 */
		
		//Shift Operator(<<, >>)
		/*int a =5;
		System.out.println(a << 1);//10
		System.out.println(a << 2);// 20
		
		System.out.println(a >> 1);//2
		System.out.println(a >> 2);//1
		*/
		
		//Even/Odd Number
		//int num =5;
		//System.out.println(num % 2 == 0 ? "Even": "Odd"); // Using % operator
		//System.out.println((num / 2) * 2 == num ? "Even": "Odd"); //Without using % operator
		//System.out.println((num & 1) == 0 ? "Even": "Odd"); //Without Arithmetic operator
		/*
		 0 1 0 1
		 0 0 0 1
		 ---------
		 0 0 0 1
		 */
	}

}
