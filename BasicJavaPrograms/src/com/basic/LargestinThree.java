package com.basic;
import java.util.Scanner;

public class LargestinThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first Number:");
		int n1=sc.nextInt();
		
		System.out.print("Enter first Number:");
		int n2=sc.nextInt();
		
		System.out.print("Enter first Number:");
		int n3=sc.nextInt();
		
		if(n1>n2&&n1>n3) {
			System.out.println(n1+" is Greater");
		}else if(n2>n1&&n2>n3) {
			System.out.println(n2+" is Greater");
		}else {
			System.out.println(n3+" is Greater");
		}
	}
		
}
