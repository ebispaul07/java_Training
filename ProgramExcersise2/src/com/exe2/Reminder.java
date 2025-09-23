package com.exe2;

import java.util.Scanner;

public class Reminder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number:");
		int n1=sc.nextInt();
		
		System.out.print("Enter Second Number:");
		int n2=sc.nextInt();
		
		
		if(n1<n2) {
			System.out.println("Second Number is Greater");
			return;
		}else {
			
			int a=n1/n2;
			int res=n1-(a*n2);
			
			System.out.println("Reminder: "+res);
			
			
			
			
		}
		
		
	}
}
