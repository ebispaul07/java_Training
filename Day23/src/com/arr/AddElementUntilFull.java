package com.arr;

import java.util.Scanner;

public class AddElementUntilFull {
	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		Scanner sc =new Scanner(System.in);
		
		
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter "+(i+1)+" Element:");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array Full!!");
		
		
	}
}
