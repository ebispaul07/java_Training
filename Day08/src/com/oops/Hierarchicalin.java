package com.oops;


class Parent1{
	void p() {
		System.out.println("I am from Parent");
	}
}

class Child1 extends Parent1{
	void c1() {
		System.out.println("I am from Child1");
	}
}

class Child2 extends Parent1{
	void c2() {
		System.out.println("I am from Child2");
	}
}

class Child3 extends Parent1{
	void c3() {
		System.out.println("I am from Child3");
	}
}



public class Hierarchicalin {
	public static void main(String[] args) {
		
		Child3 ch=new Child3();
		
		ch.c3();
		ch.p();
		
	}
	

}
