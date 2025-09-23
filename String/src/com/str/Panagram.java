package com.str;

public class Panagram {
	public static void main(String[] args) {
		
		String s=" I am Ebi";
		
		String str=s.toLowerCase();
		
		char a[]=str.toCharArray();
		
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			
			
			
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
				   flag=true;
			}
			
			
		}
		
		
		if(flag) {
			System.out.println("Panagram");
		}else {
			System.out.println("Not Panagram");
		}
		
		
		
		
		
	}

}
