package com.str;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st:");
		String a=sc.nextLine();
		a=a.intern();//it put the value into string pool
		
		System.out.print("Enter 2nd:");
		String b=sc.nextLine();
		
		b=b.intern();
		
		
		
		if(a==b) {
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
		
		
		
	}

}
