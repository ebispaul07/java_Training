package com.basic;

public class lcm {
	public static void main(String[] args) {
		int n1=2;
		int n2=6;
		
		int x=n1;
		int y=n2;
		
		while(y!=0) {
			int temp=y;
			y=x%y;
			x=temp;
		}
		
		int lcm=(n1*n2)/x;
		
		System.out.println(lcm);
	}
}
