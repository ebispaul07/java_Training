package com.abstra;

abstract class vehicle{
	 public abstract void sound();
	 
	 public void color() {
		 System.out.println("Black");
	 }
}

class Car extends vehicle{
	
	public void sound() {
		System.out.println("It Sound Like ZZZZZZ");
	}
	
}

public class Abstraction {
	public static void main(String[] args) {
		Car c=new Car();
		c.sound();
		c.color();
		
		
	}
	
}
