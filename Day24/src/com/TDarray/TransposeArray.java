package com.TDarray;

public class TransposeArray {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		
		int trans[][]=new int[3][2];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				trans[j][i]=a[i][j];
			}
		}
		
		for(int i=0;i<trans.length;i++) {
			for(int j=0;j<trans[i].length;j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
