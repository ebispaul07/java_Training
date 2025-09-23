package com.exe1;

import java.util.Scanner;

public class TemperatureAndCelsius {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter Celsius:");
		double celsi=sc.nextInt();
		
		double faren=(celsi*1.8)+32;
		
		System.out.println("Farenheit :"+faren);
		
		
		
		
	}

}
