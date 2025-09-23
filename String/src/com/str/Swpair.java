package com.str;

public class Swpair {
	public static void main(String[] args) {
		String s="abcdgt";
		
		char arr[]=s.toCharArray();
		
		
		for(int i=0;i<s.length()-1;i=i+2) {
			
			
			System.out.print(arr[i+1]);
			System.out.print(arr[i]);	
			
		}
		
		
		if(arr.length%2!=0) {
			System.out.print(arr[arr.length-1]);
		}
		
		
		
	}

}
