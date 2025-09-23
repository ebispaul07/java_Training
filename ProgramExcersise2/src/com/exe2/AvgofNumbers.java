package com.exe2;

import java.util.Scanner;

public class AvgofNumbers {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter any number to :");
		int num=sc.nextInt();
		
		double sum=0;
		
		
		for(int i=1;i<=num;i++) {
			System.out.print("Enter "+i+"th Number:");
			double in=sc.nextDouble();
			
			sum=sum+in;
		}
		
		System.out.println(sum);
		
		double avg=sum/num;
		
		System.out.println("Average:"+avg);
		
	}
}
