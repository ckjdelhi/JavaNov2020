package com.basic;

public class Array2D {

	public static void main(String[] args) {
		
		String [][]strArr= {
				{"A","B","C"},
				{"Delhi","Mumbai"},
				{"India", "US","UK", "Bhutan"}
			};
		
		
		
		//System.out.println("No of Rows: "+strArr.length);
		//System.out.println("No of Columns in first Row: "+strArr[0].length);
		
		for(int i=0; i<strArr.length;i++) {
			for(int j=0; j<strArr[i].length;j++) {
				System.out.print(strArr[i][j]+" ");
			}
			System.out.println();
		}
		
		int i=0;
		while(i<strArr.length) {
			int j=0;
			while(j<strArr[i].length) {
				System.out.print(strArr[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		for(String []temp:strArr) {
			for(String s:temp) {
				System.out.print(s +" ");
			}
			System.out.println();
		}
		
	}
}
