/*Salary Slip Generator
Write a program to calculate employee salary.
Input: Basic Salary.
HRA = 20% of Basic, DA = 50% of Basic, PF = 12% of Basic.
Calculate Gross Salary = Basic + HRA + DA – PF.
Print final Gross Salary.*/

package com.assesmnt;

import java.util.Scanner;


public class Sample {
	
	public void SalSlipGenerator(double sal) {
        System.out.println();
		
		double hra=(sal*20)/100;
		System.out.println("->Home Rent Allowance: $"+hra);
		
		double da=(sal*50)/100;
		System.out.println("->Dearness Allowance: $"+da);
		
		double pf=(sal*12)/100;
		System.out.println("->PF: $"+pf);
		
		double gross=sal+hra+da-pf;
		
		System.out.println("->GROSS SALARY: $"+gross);
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.print("<><><><><><><><><>SALARY SLIP GENERATOR<><><><><><><><><><>");
		System.out.println();
		System.out.println();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Your Salary: $");
		double sal=sc.nextDouble();
		
		System.out.println();
		
		Sample Sal=new Sample();
		
		Sal.SalSlipGenerator(sal);
		
	}
		
}
