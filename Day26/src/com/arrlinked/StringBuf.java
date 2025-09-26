package com.arrlinked;

public class StringBuf {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		
		sb.append(" World");
		
		System.out.println("String Concatination: "+sb);
		
		sb.replace(6, 11, "Java");
		
		System.out.println("String Replace: "+sb);
	}
}
