package com.TDarray;
import java.util.Scanner;

public class UserIn2DArray {
	public static void main(String[] args) {
		
		int a[][]=new int[2][3];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("Enter Number For: a["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("So the Array:");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}
 