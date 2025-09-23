package com.exe1;
import java.util.Scanner;
public class KilomtrtoMtr {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Kilometer:");
		double k=sc.nextInt();
		
		double m=k*1000;
		
		double centi=m*100;
		
		System.out.println("Meter:"+m);
		System.out.println("Centimeter:"+centi);
		
		
		
	}

}
