/*Create a program for University Staff and Students.
 Requirements:
Create a base class Person with attributes name, age.
Default and parameterized constructors.
Method showDetails().
Create a subclass Student:
Extra attributes: rollNo, course.
 Constructor overloading:
One with rollNo, name, age, course.
One with rollNo, name, course (set age as 18 by default).
Override showDetails() to include student-specific info.
 Create another subclass Professor:
 Extra attributes: empId, subject.
 Constructor to initialize all.
 Method overloading:
 calculateSalary(double base)
 calculateSalary(double base, double allowance)
 Override showDetails() to print professor details.
 In main():
Create two students (using both constructors).
Create one professor.
Show details of all.
Call both versions of calculateSalary() for professor.*/

package com.ass03;

class Person{
	String name;
	int age;
	
	
	Person(){
		
	}
	
	Person(String name,int age,int rollNo,String course){
		this.name=name;
		this.age=age;
	}
	
	public void showDetails() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		
	}
}

class Student extends Person{
	int rollNo;
	String course;
	
	Student(int rollNo,String name,int age,String course){
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		this.course=course;
	}
	
	Student(int rollNo,String name,int age){
		this.rollNo=rollNo;
		this.name=name;
		this.age=18;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("RollNo:"+rollNo);
		System.out.println("Course:"+course);
		
	}
}

class Professor extends Person{
	int empid;
	String subject;
	
	Professor(int empid, String subject) {
		super();
		this.empid = empid;
		this.subject = subject;
	}
	
	
	public void calculateSalary(double base) {
		
		
		System.out.println("Basic Salary"+base);
	}
	
	public void calculateSalary(double base,double allowance) {
		System.out.println("Salary With Allowance:"+(base+allowance));
	}

	public void showDetails() {
		System.out.println("Employee Id:"+empid);
		System.out.println("Subject:"+subject);
	}
	
	
}

public class UniverStafStud {
	public static void main(String[] args) {
		Student s1=new Student(7,"Ebi",22,"CSE");
		s1.showDetails();
		Student s2=new Student(8,"Emi",12);
		s2.showDetails();
		
		Professor p=new Professor(293959,"Automation Testing");
		p.showDetails();
		
		p.calculateSalary(100);
		p.calculateSalary(1200,100);
	}

}
