package com.oops;

class Company{
	private int regNo;
	private String name;
	
	Company(int regNo,String name){
		this.regNo=regNo;
		this.name=name;
	}
	
	
	public int getRegno() {
		return regNo;
	}
	
	public String getName() {
		return name;
	}
	
	
}


public class Industry {
	public static void main(String[] args) {
		Company c=new Company(07,"Ebi");
		
		System.out.println(c.getRegno());
		System.out.println(c.getName());
		
		
		
		
	}
}
