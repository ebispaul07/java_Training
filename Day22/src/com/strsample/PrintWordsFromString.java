package com.strsample;

public class PrintWordsFromString {
	public static void main(String[] args) {
		String a="java is super";
		
		String spa[]=a.split(" ");
		
		for(int i=0;i<spa.length;i++) {
			System.out.println(spa[i]);
		}
		
		
	}

}
