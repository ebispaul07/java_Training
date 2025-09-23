package com.cons;


class Car{
	
	String name;
	
	int age;
	
	Car(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	
	void display() {
		System.out.println("My Name is "+name+". My Age is "+age);
	}
	
}



public class Constructor {
	public static void main(String[] args) {
		
		Car c=new Car("ebi",22);
		
		c.display();
		
	}

}
