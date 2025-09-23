package com.oops;

class Grandparent{
	
	void g() {
		System.out.println("i am from grandparent");
	}
	
	
}


class Parent extends Grandparent{
	
	void p() {
		System.out.println("i am from Parent");
	}
	
}

class Child extends Parent{
	void c() {
		System.out.println("I am from Child");
	}
}


public class Multilevelin {
	public static void main(String[] args) {
		
		Child ch=new Child();
		
		ch.c();
		ch.p();
		ch.g();
		
	
		
		
	}
	
	
	
}
