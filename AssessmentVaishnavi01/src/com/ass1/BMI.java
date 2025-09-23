/*BMI Calculator
 
Write a program that takes a person’s weight and height as input and calculate the BMI.
• Input: weight (kg) and height (m).
• Calculate BMI = weight / (height × height).
• Print category:
• <18.5 → Underweight
• 18.5–24.9 → Normal
• 25–29.9 → Overweight
• ≥30 → Obese*/

package com.ass1;
import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		
		System.out.println("--------BMI Calculator--------");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Weight(kg):");
		double weight=sc.nextDouble();
		
		System.out.print("Enter Height(meter):");
		double height=sc.nextDouble();
		
		double res=weight/(height*height);
		
		System.out.println();
		System.out.println("BMI:"+res);
		
		
		if(res<18.5) {
			System.out.println("Category : Underweight");
		}else if(res>=18.5&&res<=24.9) {
			System.out.println("Category : Normal");
		}else if(res>=25&&res<=29.9) {
			System.out.println("Category : OverWeight");
		}else if(res>=30) {
			System.out.println("Category : Obese");
		}
		
		
	}
}











