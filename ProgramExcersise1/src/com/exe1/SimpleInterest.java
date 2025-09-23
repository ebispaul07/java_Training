package com.exe1;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principle: ");
		double principle=sc.nextDouble();
		
		
		System.out.print("Enter RateOfInterest: ");
		double rate=sc.nextDouble();
		
		System.out.print("Enter Time: ");
		double time=sc.nextDouble();
		
		double SI=principle*rate*time;
		
		System.out.println("Simple Intrest: "+SI);
		
	}

}
