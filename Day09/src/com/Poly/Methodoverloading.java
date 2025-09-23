package com.Poly;


public class Methodoverloading {
	
	public int  add(int a,int b) {
		
		int res=a+b;
		
		return res;
	}
	
	static int add(int a,int b,int c) {
		int res=a+b+c;
		
		return res;
	}
	
	public static void main(String[] args) {
		
		Methodoverloading mo=new Methodoverloading();
		
		
		System.out.println("Method Overloading Example");
		
		
		System.out.println("Static Function:"+add(1,2,4));
		
		System.out.println("Public Function:"+mo.add(2,4));
		
	}

}
