package com.Array;

public class Largestelem {
	public static void main(String[] args) {
		
		int a[]= {8,4,2,90,7};
		
		
		int max=a[0];
		
		int min=a[0];
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println(max);
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println(min);
		
	}
}
