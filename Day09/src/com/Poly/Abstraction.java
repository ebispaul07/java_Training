/*Create an abstract class Shape with abstract method area().
Create two classes Circle and Rectangle that extend Shape and calculate area.
Print the area of both shapes.

Expected Output Example (if radius=5, length=4, width=6):*/

package com.Poly;

import java.util.Scanner;

abstract class Shape{
	abstract double area(double r);
}

class Circle extends Shape{
	public double area(double r) {
		final double pi=3.14;
		
		return pi*r*r;
		
	}
}

class Rectangle extends Shape{
	public double area(double h) {
		int w=2;
		return w*h;
	}
}


public class Abstraction {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Radius Of Circle:");
		double cr=sc.nextDouble();
		
		
		Circle c=new Circle();
		System.out.println(c.area(cr));
		
		Rectangle r=new Rectangle();
		
		System.out.print("Enter Height of a Rectangle:");
		double rr=sc.nextDouble();
		
		System.out.println(r.area(rr));
		
		
		
		
	}

}
