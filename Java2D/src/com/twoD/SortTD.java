package com.twoD;


public class SortTD {
	public static void main(String[] args) {
		
		int a[][]= {{2,3,1},{4,5,6},{9,8,7}};
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					for(int l=0;l<a.length;l++) {
						if(a[i][j]>a[k][l]) {
							int temp=a[i][j];
							a[i][j]=a[k][l];
							a[k][l]=temp;
						}
					}
				}
			}
		}
		
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
