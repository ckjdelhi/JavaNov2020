package com.basic;

public class Array3D {

	public static void main(String[] args) {
		int [][][]arr3d= {
				{
					{1, 2,3},
					{1},
					{3,4}
				},
				{
					{1,2},
					{2},
					{4,5,6}
				}
		};

		/*System.out.println(arr3d.length);
		System.out.println(arr3d[0].length);
		System.out.println(arr3d[0][1].length);*/
		
		for(int [][]t2d: arr3d) {
			for(int []t1d: t2d) {
				for(int t: t1d) {
					System.out.print(t +" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		for(int i=0;i<arr3d.length;i++) {
			for(int j=0;j<arr3d[i].length;j++) {
				for(int k=0;k<arr3d[i][j].length;k++) {
					System.out.print(arr3d[i][j][k] +" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
