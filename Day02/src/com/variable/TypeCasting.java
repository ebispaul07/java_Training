package com.variable;

//Typecasting is used for Cast from one dt to another dt
//There are two types
//1.Widening casting(small->big)
//2.Narrowing casting(big->small)


public class TypeCasting {
	
	public static void main(String[] args) {
		
		int a=10;
		float f=a;
		
		System.out.println("FLoat from int:"+f);//widening Casting
		
		float k=1.22f;
		
		int z=(int)k;
		
		System.out.println("int from Float:"+z);//narrowing casting
		
		
		//String cannot done by cast it is done by parsing
		
		String s="123";
		
		int n=Integer.parseInt(s);
		
		System.out.println("Parsed from string:"+n);
		
		
		//rounding ---it cut off decimals
		
		double d=1.223;
		
		int t=(int)Math.round(d);
		
		System.out.println("After Rounding: "+t);
		
		//also have big integer,big decimel,string for store large data
		
		
		
		
		
		
		
		
	}

}
