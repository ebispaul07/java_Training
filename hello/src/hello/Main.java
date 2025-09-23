package hello;

import java.io.FileWriter;
import java.util.Scanner;

public class Main{
	
	String username[]=new String[10];
	String password[]=new String[10];
	int count=0;
	
	public void Register() {
		try {
			FileWriter fr=new FileWriter("register.txt");
		
		
		System.out.println("Welcome to Registration");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter New Name:");
		String NN=sc.nextLine();
		
		System.out.print("Enter Password:");
		String NP=sc.nextLine();
		
		username[count]=NN;
		password[count]=NP;
		
		count++;
		
		System.out.println("Successfully Registered!!");
		
		fr.write(NN+"|"+NP);
		
		fr.close();
		
		}catch(Exception e) {
			System.out.println("An Error Occured");
		}
		
	}
	
	public void Login() {
		
		System.out.println("Welcome to Login");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name:");
		String name=sc.nextLine();
		
		System.out.print("Enter Password:");
		String pass=sc.nextLine();
		
		boolean flag=false;
		
		for(int i=0;i<count;i++) {
		
		if(name.equals(username[i])&&pass.equals(password[i])) {
			
			flag=true;
			break;
			
		}
		}
		
		if(flag) {
		System.out.println("Login Sucessfully");
		}else {
			System.out.println("Invalid Credentials");
		}
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		Main m=new Main();
		int num;
		
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("<><><><><MENU<><<<><><");
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			System.out.print("Enter Choice:");
			num=sc.nextInt();
			
			switch(num) {
			case 1:
				m.Register();
				break;
			case 2:
				m.Login();
				break;
			case 3:
				System.out.println("Bye....");
				return;
				
			}
			
			
			
			
		}
		
		
	}
}