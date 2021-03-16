package com.basic;

public class StringDemo{

	public static void main(String[] args) {
		/*String s1=new String("ABC");
		String s2="ABC";
		String s3 = new String("ABC");
		String s4 ="ABC";
		
		System.out.println(s1);
		System.out.println(s2);

		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1 == s2);//false
		
		System.out.println(s1 == s3); //false
		
		System.out.println(s2 == s4);//true*/
		
		String s1 ="Welcome to java";
		s1 = s1.concat(" Programming");
		System.out.println(s1);
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.contains("java"));
		
		System.out.println("C:\\Users\\Chandan\\Desktop\\Feb 21");
		System.out.println("Chandan\nKumar");
		
		String s=new String("Welcome");
		if(s!=null && s.length()>0) {
			System.out.println(s.substring(5));
			System.out.println(s.substring(0, 3));
		}
		
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.substring(s1.indexOf("java")));
		
		String s2="A";
		String s3="a";
		System.out.println(s2.compareTo(s3));
		
		String str = "This | is | Java | Programming";
		String arr[]= str.split("|");
		String s5=" ";
		for(String t:arr) {
			s5= s5 + t;
		}
		System.out.println(s5.charAt(50));
	}

}
