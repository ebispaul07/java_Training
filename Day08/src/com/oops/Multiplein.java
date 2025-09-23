package com.oops;

interface Father{
	default void f() {
		System.out.println("Message from Father");
	}
}

interface Mother{
	static void m() {
		System.out.println("Message from Mother");
	}
}

class Child9 implements Father,Mother{
	void c() {
		System.out.println("Message From Childs");
	}
}


public class Multiplein {
	public static void main(String[] args) {
		
		Child9 ch=new Child9();
		
		ch.c();
		ch.f();
		Mother.m();
		
		
		
		
	}
	
	
}
