package com.ass02;
import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Mark (Out of 100):");
		int mark=sc.nextInt();
		
		
		if(mark>=90) {
			System.out.println("Grade : A");
		}else if(mark>=75&&mark<=89) {
			System.out.println("Grade : B");
		}else if(mark>=60&&mark<=74) {
			System.out.println("Grade : C");
		}else if(mark>=40&&mark<=59) {
			System.out.println("Grade : D");
		}else if(mark<40) {
			System.out.println("Grade : Fail");
		}
		
	}

}
