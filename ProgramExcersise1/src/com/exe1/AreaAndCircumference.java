package com.exe1;

import java.util.Scanner;

public class AreaAndCircumference {
		public static void main(String[] args) {
			final double pi=3.14;
			
			Scanner sc=new Scanner(System.in);
			System.out.print("ENter radius of a Circle:");
			double radius=sc.nextDouble();
			
			double area=(pi*radius*radius);
			
			double Circumference=2*(pi*radius);
			
			
			
			System.out.println("Area of the Circle: "+area);
			System.out.println("Circumference of a Circle: "+Circumference);
			
			
			
			
			
			
			
		}
}
