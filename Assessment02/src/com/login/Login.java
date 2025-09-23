/*Login Attempt (do-while loop)
Scenario:
Simulate a login system. A user is allowed up to 3 attempts to enter the correct password ("java123").
Requirements:
Use a do-while loop
If the password is correct, print “Login Successful”
If the user fails after 3 attempts, print “Account Locked”
Hint: Keep track of attempts and break the loop on success*/


package com.login;

import java.util.Scanner;


public class Login {
	public static void main(String[] args) {
		
		
		
		System.out.println("<><><><><><><><>Welcome to Login Page<><><><><><><><>");
		
		System.out.println();
		
		Scanner sc =new Scanner(System.in);
		
		
		
		
		int count=0;
		
		
			
		System.out.print("Enter Name->");
		String name=sc.nextLine();
		
		do {
		
		System.out.print("Enter Password->");
		String pass=sc.nextLine();
		
		if(pass.equals("java123")) {
			System.out.println();
			System.out.println(".....Login Successfull.....");
			return;
		}
		
		System.out.println();
		System.out.println("Invalid PassWord...You Have "+(2-count)+" More Chances!!");
		
		
			
		count++;
		
		if(count==3) {
			System.out.println();
			
			System.out.println("------Account locked------");
			return;
		}
		
		
		}while(count<=3);
		
		
		
		
		
		
		
		
		
		
	}

}
