package com.ass03;


class Person{
	String name;
	int age;
	
	Person(){
		this.name="UnKnown";
		this.age=0;
	}
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void displayDetails() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	
}

class Employee extends Person{
	int empId;
	double salary;
	
	Employee(){
		this.empId=empId;
		this.salary=salary;
	}
	
	Employee(String name,int age,int empId,double salary){
		super(name,age);
		this.empId=empId;
		this.salary=salary;
	}
	
	
	public void calculateSalary(double bonusPercent) {
		double bonus=(salary*bonusPercent)/100;
		System.out.println("Bonus Percentage:"+bonus);
	}
	
	public void calculateSalary(double bonusPercent,double allowance) {
		double bonus=(salary*bonusPercent)/100;
		double totalSal=salary+bonus+allowance;
		
		System.out.println("Total Salary:"+totalSal);
	}
	
	
	public void displayDetails() {
		System.out.println("Employee:"+empId);
		System.out.println("Salary:"+salary);
	}
	
}


public class EmployeeManagement {
	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.displayDetails();
		
		Person p2=new Person("Ebi",23);
		p2.displayDetails();
		
		Employee e1=new Employee("Ebi",23,293959,26000);
		e1.calculateSalary(10);
		e1.calculateSalary(10, 2000);
		e1.displayDetails();
		
	}

}
