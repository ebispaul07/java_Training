package com.d3;

import java.util.Scanner;

public class calculator {
	
	public  double add(double num1,double num2) {
		double a=num1+num2;
		
		return a;	
		}

	public double sub(double num1,double num2) {
		double a=num1-num2;
		
		return a;
	}
	
	public double mul(double num1,double num2) {
		double a=num1*num2;
		
		return a;
	}
	
	public double div(double num1,double num2) {
		if(num2==0) {
			System.out.println("Number Divided by zero is Not Allowed");
			return 0;
		}
		
		double d=num1/num2;
			
		return d;
		
	}
	
	public static void main(String[] args) {
		
		calculator c=new calculator();
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("CALCULATOR");
			System.out.println("1.Addition");
			System.out.println("2.Substration");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.print("Choice:");
			int opt=sc.nextInt();
			
			switch(opt) {
			case 1:
				System.out.print("Enter First Number:");
				double num1=sc.nextDouble();
				System.out.print("Enter Second Number:");
				double num2=sc.nextDouble();
				System.out.println(c.add(num1, num2));
				
				break;
				
			case 2:
				System.out.print("Enter First Number:");
				double n1=sc.nextDouble();
				System.out.print("Enter Second Number:");
				double n2=sc.nextDouble();
				System.out.println(c.sub(n1, n2));
				break;
				
			case 3:
				System.out.print("Enter First Number:");
				double nu1=sc.nextDouble();
				System.out.print("Enter Second Number:");
				double nu2=sc.nextDouble();
				System.out.println(c.mul(nu1, nu2));
				break;
				
			case 4:
				System.out.print("Enter First Number:");
				double a=sc.nextDouble();
				System.out.print("Enter Second Number:");
				double b=sc.nextDouble();
				System.out.println(c.div(a, b));
				break;
				
			default :
				
				System.out.println("Invalid input..");
				
				
			}
			
			
			
		}
		
		
	}

}
