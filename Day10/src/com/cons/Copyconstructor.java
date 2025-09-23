package com.cons;

class Sample{
	String name;
	int age;
	
	Sample(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	Sample(Sample other){
		this.name=other.name;
		this.age=other.age;
	}
	
	void display() {
		System.out.println(name+"   "+age);
	}
	
	
}


public class Copyconstructor {
	public static void main(String[] args) {
		
		Sample s1=new Sample("Ebi",7);
		Sample s2=new Sample(s1);
		
		s1.display();
		s2.display();
		
	}

}
