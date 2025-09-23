package com.strsample;

import java.util.Scanner;

public class ExcepStr {
	public static void main(String[] args) {
		
		try {
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter Integer:");
			
			String s=sc.nextLine();
			
			int num=Integer.valueOf(s);
			
			System.out.println(num);
			
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
