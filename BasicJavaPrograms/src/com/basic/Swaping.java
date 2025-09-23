package com.basic;

public class Swaping {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println(a+"  "+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+"  "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+"  "+b);
	}
}
