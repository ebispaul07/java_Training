package com.str;

//anagram

public class SortStr {
	public static void main(String[] args) {
		String str1="Ebisp";
		String str2="Esibp";
		
		String s1=str1.toLowerCase();
		String s2=str2.toLowerCase();
		
		char a[]= s1.toCharArray();
		char b[]=s2.toCharArray();
		
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s1.length()-1;j++) {
				if(a[j]>a[j+1]) {
					char temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		
		
		for(int i=0;i<s2.length();i++) {
			for(int j=0;j<s2.length()-1;j++) {
				if(b[j]>b[j+1]) {
					char temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		
		System.out.println();
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]);
		}
		
		
	}
	
}
