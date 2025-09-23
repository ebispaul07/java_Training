package com.poly;

public class Main {
	
	public int sum(int a,int b) {
		
		return a+b;
	}
	
	public int sum(int x,int y,int z) {
		
		return x+y+z;
	}
	
	public static void main(String[] args) {
		
		Main m=new Main();
		
		System.out.println(m.sum(2, 4));
		System.out.println(m.sum(8, 3, 2));
		
		
	}
	

}
