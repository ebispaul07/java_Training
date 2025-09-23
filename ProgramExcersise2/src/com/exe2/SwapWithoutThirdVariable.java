package com.exe2;

public class SwapWithoutThirdVariable {
		public static void main(String[] args) {
			
			int a=10;
			int b=20;
			
			System.out.println("Before: A = "+a+" B = "+b);
			
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("Before: A = "+a+" B = "+b);
			
		}
}
