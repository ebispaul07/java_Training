package com.prac;

public class LongestPrefix {
	public static void main(String[] args) {
		String s[]= {"flower","flow","flight"};
		
		String pre=s[0];
		
		for(int i=1;i<s.length;i++) {
			while(s[i].indexOf(pre)!=0) {
				pre=pre.substring(0,pre.length()-1);
			}
		}
		
		System.out.println(pre);
		
	}

}
