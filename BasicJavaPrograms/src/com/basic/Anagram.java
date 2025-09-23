package com.basic;

public class Anagram {
	public static void main(String[] args) {
		String a ="nat";
		String b="tan";
		
		String a1=a.toLowerCase();
		String a2=b.toLowerCase();
		
		char x[]=a1.toCharArray();
		char y[]=a2.toCharArray();
		
		for(int i=0;i<x.length-1;i++) {
			for(int j=0;j<x.length-1-i;j++) {
				
				if(x[j]>x[j+1]) {
					char temp=x[j];
					
					x[j]=x[j+1];
					x[j+1]=temp;
					
				}
				
				
				
			}
		}
		/*
		 * for(int k=0;k<x.length;k++) { System.out.print(x[k]); }
		 */
		
	
		
		for(int i=0;i<y.length-1;i++) {
			for(int j=0;j<y.length-1-i;j++) {
				
				if(y[j]>y[j+1]) {
					char temp=y[j];
					
					y[j]=y[j+1];
					y[j+1]=temp;
					
				}
				
				
				
			}
		}
		
		/*
		 * for(int k=0;k<y.length;k++) { System.out.print(y[k]); }
		 */
		boolean flag=true;
		for(int i=0;i<x.length;i++) {
			if(x[i]!=y[i]) {
				flag=false;
				break;
			}
		}
		
		if(flag) {
			System.out.print("Anagram");
		}else {
			System.out.print("Not Anagram");
		}
		
	}

}
