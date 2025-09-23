package com.cons;

public class Arraymax {
	
	static int max(int a[]) {
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			
		}
		
		return max;
		
	}
	
	
	public static void main(String[] args) {
		
		int a[]= {5,2,7,3,1};
		
		System.out.println(max(a));
		
	}

}
