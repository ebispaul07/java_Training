package com.self;

import java.util.ArrayList;

class Employee{
	String name;
	int salary;
	
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
		}
	
	public String toString() {
		return "Name:"+name+" Salary:"+salary;
	}
	
}




public class ArraylistEmplo {
	public static void main(String[] args) {
		
		ArrayList<Employee> e=new ArrayList<>();
		
		e.add(new Employee("Ebi",123));
		e.add(new Employee("Emi",124));
		
		System.out.print(e);
		
		
	}

}
