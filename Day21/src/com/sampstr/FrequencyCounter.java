package com.sampstr;

public class FrequencyCounter {
	public static void main(String[] args) {
		
		String s="apple";
		
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
