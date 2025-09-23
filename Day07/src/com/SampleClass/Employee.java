/*Create a class Employee with:

id, name, salary

constructor to initialize values

method display() to print employee details*/

package com.SampleClass;



class emp{
	int id;
	String name;
	int salary;
	
	
	emp(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display() {
		System.out.println(id+"   "+name+"    "+salary);
	}
	
	
}



public class Employee {
	
	public static void main(String[] args) {
		
		emp e=new emp(07,"ebi",7000);
		
		e.display();
		
	}

}
