package com.exe2;

import java.util.Scanner;

public class SquareAndCube {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Any Number:");
		double num=sc.nextDouble();
		
		double sqr=num*num;
		
		double cube=num*num*num;
		
		System.out.println("Square: "+sqr+"Cube: "+cube);
		
		
		
		
	}

}
