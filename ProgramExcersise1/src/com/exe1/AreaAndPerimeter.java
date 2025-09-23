package com.exe1;

import java.util.Scanner;

public class AreaAndPerimeter {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Length of a Rectange:");
		double l=sc.nextInt();
		
		System.out.print("Enter Breadth of a Rectangle:");
		double b=sc.nextInt();
		
		double area=l*b;
		
		double perimtr=2*(l+b);
		
		System.out.println("Area of a Rectangle: "+area);
		System.out.println("Perimeter of a Rectangle: "+perimtr);
		
		
		
		
	}
}
