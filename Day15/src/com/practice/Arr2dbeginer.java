package com.practice;
import java.util.Scanner;

public class Arr2dbeginer {
	
	public void inMatrix() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number Of Rows:");
		int r=sc.nextInt();
		
		System.out.print("Enter Number Of Colums:");
		int c=sc.nextInt();
		
		int a[][]=new int[r][c];
		
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
			
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void sumMatrix() {
		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		int sum=0;
		
		for(int i=0;i<a.length)
		
		
		
	}
	
	public static void main(String[] args) {
		Arr2dbeginer a=new Arr2dbeginer();
		a.inMatrix();
		
		
	}
}
