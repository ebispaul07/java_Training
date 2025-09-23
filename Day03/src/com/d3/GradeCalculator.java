package com.d3;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Your Mark: ");
		int m=sc.nextInt();
		
		if(m<35&&m>0) {
			System.out.println("You Failed");
		}else if(m==35) {
			System.out.println("You Just Passed");
		}else if(m<=50&&m>=75) {
			System.out.println("Good");
		}else if(m<=76&&m<=100) {
			System.out.println("Excelent");
		}
		
		
		
	}
}
