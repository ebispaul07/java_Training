package com.oops;


class car{
	private String brand;
	private String model;
	private int price;
	
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
}



public class Main {
	public static void main(String[] args) {
		
		car c=new car();
		
		c.setBrand("Audi");
		c.setModel("A1");
		c.setPrice(150000);
		
		
		System.out.println(c.getBrand());
		System.out.println(c.getModel());
		System.out.println(c.getPrice());
		
		
		
	}
}
