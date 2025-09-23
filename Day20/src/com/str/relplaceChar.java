package com.str;

public class relplaceChar {
	public static void main(String[] args) {
		
		String name="ebib";
		
		String r=name.replaceAll("[aeiou]", "");
		
		System.out.println(r);
		
		String str="ebispaul";
		
		String sub=str.substring(2,6);
		
		System.out.println(sub);
		
		String a="apple";
		
		int index=1;
		
		a=a.substring(0,index)+'b'+a.substring(index+1);
		
		System.out.println(a);
		
	}

}
