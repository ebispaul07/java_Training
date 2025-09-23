package com.strsample;

public class RemoveDupli {
	public static void main(String[] args) {
		String s="Apple";
		
		String e="";
		
		for(int i=0;i<s.length();i++) {
			
			if(e.indexOf(s.charAt(i))==-1) {
				e=e+s.charAt(i);
			}
			
		}
		
		System.out.println(e);
		
	}

}
