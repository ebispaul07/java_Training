package com.loops;

import java.util.Scanner;

public class table {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter Any Number:");
			int in=sc.nextInt();
			
			
			for(int i=0;i<in;i++) {
				for(int j=in;j<in+1;j++) {
					System.out.print("0 ");
				}
				System.out.println();
			}
			
			
			
			
		}
}
