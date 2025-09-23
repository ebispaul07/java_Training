package com.poly;
import java.util.Scanner;

public class Login {
	
	String name[]=new String[10];
	String pass[]=new String[10];
	int count=0;
	
	
	public void Register() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter New Name:");
		String NN=sc.nextLine();
		
		System.out.println("Enter New Password:");
		String NP=sc.nextLine();
		
		name[count]=NN;
		pass[count]=NP;
		
		count++;
		
		System.out.println("Successfully Registered!!");
		
		
		
	}
	
	
	public void Log() {
		
		System.out.println("Welcome to Login");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name:");
		String Name=sc.nextLine();
		
		System.out.println("Enter Password:");
		String Pass=sc.nextLine();
		
		boolean flag=false;
		
		for(int i=0;i<count;i++) {
			
			if(Name.equals(name[i])&&Pass.equals(pass[i])) {
				flag=true;
				break;
			}
			
			
		}
		
		if(flag) {
			System.out.println("Login Successfully");
		}else {
			System.out.println("Invalid Credentials");
		}
		
	}
	
	

	public static void main(String[] args) {
		
		Login l=new Login();
		
		
		while(true){
		System.out.println("Welcome to login Form");
		System.out.println("1.Register");
		System.out.println("2.Login");
		System.out.println("3.Exit");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Choice:");
		int num=sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Welcome to Registration");
			l.Register();
			break;
		case 2:
			System.out.println("Welcome to Login");
			l.Log();
			break;
		case 3:
			
			System.out.println("Byeee");
			return;
			
			
		}
		
		
		
		}
		
		
		
		
		
		
	}
	
}
