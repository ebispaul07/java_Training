package com.twoD;

public class Determinent {
	public static void main(String[] args) {
		
		int a[][]= {{1,2},
					{3,4}};
		
		int det=a[0][0]*a[1][1]-(a[0][1]*a[1][0]);
		
		System.out.println("DeterMinent:"+det);
		
	}

}
