package com.SampleClass;


class car{
	String model;
	int price;
	
	
	car(String model,int price){
		this.model=model;
		this.price=price;
	}
	
	public void spec() {
		System.out.println(model+"   "+price);
	}
	
}



public class Main{
	public static void main(String[] args) {
		
		car c=new car("Bmw",120000);
		
		c.spec();
		
		
		
		
	}
}