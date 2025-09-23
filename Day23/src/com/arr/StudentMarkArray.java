package com.arr;


class Student{
	String name;
	int rollno;
	int mark[];
	
	Student(String name,int rollno,int mark[]){
		this.name=name;
		this.rollno=rollno;
		this.mark=mark;
	}
	
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+rollno);
		System.out.print("Mark:");
		
		for(int i=0;i<mark.length;i++) {
			System.out.print(mark[i]+" ");
		}
		
		
		
	}
	
	
}



public class StudentMarkArray {
	public static void main(String[] args) {
		
		int mark[]= {10,20,30,40,50};
		
		
		Student s=new Student("Ebi",7,mark);
		s.display();
		
		
	}

}
