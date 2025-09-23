package com.Array;

public class SortingArr {
	
	static void sortstr() {
		String str="ebi";
		
		char s[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length()-1;j++) {
				if(s[j]>s[j+1]) {
					char temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		
		
		for(int i=0;i<str.length();i++) {
			System.out.print(s[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		int a[]= {5,3,4,9,11,2};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		sortstr();
		
	}
}
