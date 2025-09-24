package com.TDarray;

public class MaxAndMin2DArray {
	public static void main(String[] args) {
		
		int a[][]= {{8,9,3},{4,1,3}};
		
		int max=a[0][0];
		int min=a[0][0];
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
				}
				
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		
		System.out.println("Minimum Element In an Array:"+min);
		
		System.out.println("Maximum Element In an Array:"+max);
		
	}

}
