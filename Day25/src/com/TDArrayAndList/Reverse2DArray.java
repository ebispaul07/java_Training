package com.TDArrayAndList;

public class Reverse2DArray {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=a.length;j>=0;j--) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
