package com.arrlinked;

public class StrBuilderSample {
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello");
		
		String s=" World";
		
		sb.append(s);
		
		System.out.println(sb);
		
		sb.replace(6, 11, "Java");
		
		System.out.println(sb);
		
		
	}
}
