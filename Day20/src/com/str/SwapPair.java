package com.str;

public class SwapPair {
	public static void main(String[] args) {
		
		String s="abcdef";
		
		char a[]=s.toCharArray();
		
		for(int i=0;i<s.length()-1;i=i+2) {
			char temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		
	}

}
