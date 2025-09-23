package com.exe1;

import java.util.Scanner;

public class Ascii {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter any Character:");
		char c=sc.next().charAt(0);
		
		int Convrt=c;
		
		System.out.println("Ascii value of "+c+" is " +Convrt);
		
		
	}
}
