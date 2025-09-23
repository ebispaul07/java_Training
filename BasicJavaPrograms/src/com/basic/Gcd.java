package com.basic;

public class Gcd {
	public static void main(String[] args) {
		int a=10;
		int b=12;
		
		int x=a;
		int y=b;
		
		while(y!=0) {
			int temp=y;
			y=x%y;
			x=temp;
		}
		
		System.out.println("GCD: "+x);
	}

}
