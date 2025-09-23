package com.oops;


class Parent2{
	void p() {
		System.out.println("I am From Parent");
	}
}

class Child extends Parent2{
	void c() {
		System.out.println("I am From Child");
	}
}


public class SingleIn {
	public static void main(String[] args) {
		
		Child c=new Child();
		c.c();
		c.p();
		
		System.out.println("I am From Main");
		
		
	}

}
