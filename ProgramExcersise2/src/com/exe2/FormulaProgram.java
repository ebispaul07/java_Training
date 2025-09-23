package com.exe2;

import java.util.Scanner;

public class FormulaProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter First Number:");
		double a=sc.nextDouble();
		
		System.out.print("Enter Second Number:");
		double b=sc.nextDouble();
		
		System.out.print("Enter Third Number:");
		double c=sc.nextDouble();
		
		System.out.print("Enter Fourth Number:");
		double d=sc.nextDouble();
		
		
		double formula=(a + b) * (c / d);
		
		System.out.println("Result: "+formula);
	}
}
