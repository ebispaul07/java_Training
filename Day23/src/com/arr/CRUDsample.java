package com.arr;
import java.util.Scanner;

public class CRUDsample {
	
	String name[]=new String[100];
	int count=0;
	
	public void add() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name to Add:");
		String nameAdd=sc.nextLine();
		
		name[count]=nameAdd;
		count++;
		
		System.out.println();
		System.out.println("Successfully Added Name");
		
		
		
	}
	
	public void delete() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name For Delete:");
		String delName=sc.nextLine();
		
		for(int i=0;i<name.length;i++) {
			if(name[i].equals(delName)) {
				
			for(int j=i;j<count-1;j++) {
				name[j]=name[j+1];
			}
				
			}
			
			count--;
			System.out.println("Successfully deleted...");
			break;
		}
		
	}
	
	public void display() {
		if(count==0) {
			
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(name[i]);
		}
	}
	
	public void update() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name to Update:");
		String upName=sc.nextLine();
		
		System.out.print("Enter name to Update:");
		String newName=sc.nextLine();
		
		boolean flag=false;
		
		for(int i=0;i<name.length;i++) {
				if(name[i].equals(upName)) {
					name[i]=newName;
					flag=true;
					break;
				}
		}
		
		if(flag) {
			System.out.println("Name Updated Successfully...");
		}else {
			System.out.println("name not found");
		}
	}
	
	public void search() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name to Search:");
		String seName=sc.nextLine();
		
		boolean flag=false;
		
		for(int i=0;i<count;i++) {
			if(name[i].equals(seName)) {
				flag=true;
			}
		}
		
		if(flag) {
			System.out.println("Name Found:"+seName);
		}else {
			System.out.println("Name Not Found:"+seName);
		}
		
	}
	
	public static void main(String[] args) {
		
		CRUDsample c=new CRUDsample();
		
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Welcome To CRUD Operations");
			System.out.println();
			System.out.println("1.Add");
			System.out.println("2.Delete");
			System.out.println("3.Update");
			System.out.println("4.Search");
			System.out.println("5.Display");
			System.out.println("6.Exit!!!");
			System.out.print("Choice:");
			int in=sc.nextInt();
			
			switch(in) {
			
			case 1:
				c.add();
				break;
				
			case 2:
				
				c.delete();
				break;
				
			case 3:
				c.update();
				break;
				
			case 4:
				c.search();
				break;
				
			case 5:
				c.display();
				break;
			
			}
			
			
			
			
		}
		
		
		
	}

}
