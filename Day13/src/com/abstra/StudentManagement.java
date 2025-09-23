package com.abstra;
import java.util.Scanner;

class Student{
	private int rollno;
	private String name;
	private int mark;
	
	
	Student(int rollno,String name,int mark){
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
	}
	
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMark(int mark) {
		this.mark=mark;
	}
	
	public int getMark() {
		return mark;
	}
	
	public void display() {
		System.out.println("Roll No: "+rollno);
		System.out.println("Student Name: "+name);
		System.out.println("Student Mark: "+mark);
	}
	
}



public class StudentManagement {
	
	private static Student stud[]=new Student[100];
	private static int count=0;
	
	
	public static void addStudent(int rollno,String name,int mark) {
		stud[count]=new Student(rollno,name,mark);
		count++;
		
		System.out.println("Student Added Successfully...");
	}
	
	
	public static void viewStudent() {
		
		if(count==0) {
			System.out.println("No Student Found");
			return;
		}
		
		System.out.println("Student Lists.....");
		
		for(int i=0;i<count;i++) {
			stud[i].display();
		}
		
	}
	
	
	public static void searchStud(int roll) {
		for(int i=0;i<count;i++) {
			if(stud[i].getRollno()==roll) {
				System.out.println("Student Found");
				stud[i].display();
				return;
			}
		}
		
		System.out.println("Student Not Found");
	}
	
	
	public static void updateStud(int roll,String name,int mark) {
		
		boolean flag=false;
		
		for(int i=0;i<count;i++) {
			if(stud[i].getRollno()==roll) {
				stud[i].setName(name);
				stud[i].setMark(mark);
				System.out.println("Student Successfully Updated");
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Student Not Found");
		}
		
	}
	
	
	public static void deleteStud(int rnum) {
		boolean flag=false;
		
		for(int i=0;i<count;i++) {
			if(stud[i].getRollno()==rnum) {
				
				for(int j=i;j<count-1;j++) {
					stud[j]=stud[j+1];
				}
				
				stud[count-1]=null;
				count--;
				System.out.println("Successfully Deleted...");
				flag=true;
				break;
				
			}
		}
		
		if(!flag) {
			System.out.println("Student Not Found!!");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		StudentManagement sm=new StudentManagement();
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		
		System.out.println("...Student Management System...");
		System.out.println();
		
		System.out.println("1.Add Student");
		System.out.println("2.View Student");
		System.out.println("3.Search Student");
		System.out.println("4.Update Student");
		System.out.println("5.Delete Student");
		System.out.println("6.Exit");
		
		System.out.print("Choice:");
		int in=sc.nextInt();
		
		switch(in) {
		case 1:
			System.out.println("Add Students....");
			
			System.out.print("Enter Roll Number:");
			int rno=sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter Name:");
			String sname=sc.nextLine();
			
			System.out.print("Enter Mark:");
			int mark=sc.nextInt();
			
			addStudent(rno,sname,mark);
			break;
			
		case 2:
			viewStudent();
			break;
			
		case 3:
			
			System.out.print("Enter RollNumber To Search:");
			int rono=sc.nextInt();
			
			searchStud(rono);
			break;
			
		case 4:
			System.out.println("Welcome to update Student");
			
			System.out.print("Enter RollNo to Update:");
			int roll=sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter Name to Update:");
			String uname=sc.nextLine();
			
			System.out.print("Enter Mark to Update:");
			int umark=sc.nextInt();
			
			updateStud(roll,uname,umark);
			break;
			
			
		case 5:
			
			System.out.print("Enter Roll Number to Delete:");
			int drno=sc.nextInt();
			
			deleteStud(drno);
			
			break;
			
		case 6:
			System.out.println("Bye.....");
			return;
			
		}
		
		
		
		
		
		}
		
		
	}

}
