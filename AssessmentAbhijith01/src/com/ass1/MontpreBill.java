/*Please find the below assignment .
 
Assignment 1 – Monthly vs Previous Month Bill
 
Input: Units consumed in Current Month and Previous Month.
 
Tariff: ₹4 per unit up to 250 units, else ₹6 per unit.
 
Calculate both bills.
                                                                                                                                        
Compare them using relational operators.
 
Use logical operators to check if both months exceeded ₹3000.*/

package com.ass1;
import java.util.Scanner;

public class MontpreBill {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Current Month Consumed Unit:");
		int cu=sc.nextInt();
		
		System.out.print("Enter previous Month Consumed Unit:");
		int preu=sc.nextInt();
		
		int ctot=0;
		
		if(cu<=250) {
			ctot=ctot+cu*4;
			
			System.out.println("Current Month Bill:"+ctot);
		}else {
			ctot=ctot+cu*6;
			System.out.println("Current Month Bill:"+ctot);
		}
		
		int ptot=0;
		
		if(preu<=250) {
			ptot=ptot+preu*4;
			
			System.out.println("previous Month Bill:"+ptot);
		}else {
			ptot=ptot+preu*6;
			System.out.println("Previous Month Bill:"+ptot);
		}
		
		if(ctot>3000&&ptot>3000) {
			System.out.println("Both month Exceed 3000");
		}else {
			System.out.println("Both Month Not Exceed");
		}
		
	}

}
