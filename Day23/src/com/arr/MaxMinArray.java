package com.arr;

public class MaxMinArray {
	public static void main(String[] args) {
		int a[]= {5,3,1,6,8,9};
		
		int min=a[0];
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		
		System.out.println("Minimum Number:"+min);
		
		System.out.println("Maximum Number:"+max);
		
	}

}
