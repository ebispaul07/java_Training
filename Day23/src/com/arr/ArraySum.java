package com.arr;

public class ArraySum {
	public static void main(String[] args) {
		int a[]= {9,1,2,3,1,6};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		System.out.println("Sum Of Array:"+sum);
		
	}

}
