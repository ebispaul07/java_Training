package com.str;


public class Sortstr {
	public static void main(String[] args) {
		String s="ebi";
		
		char str[]=s.toCharArray();
		
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length()-1-i;j++) {
				if(str[j]>str[j+1]) {
					char temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
					
				}
			}
		}
		
		
		for(int i=0;i<s.length();i++) {
			System.out.print(str[i]);
		}
		
	}

}
