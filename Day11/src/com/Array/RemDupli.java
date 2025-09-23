package com.Array;

public class RemDupli {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,4,5,5};
		
		int b[]=new int[a.length];
		
		int count=0;
		
		
		for(int i=0;i<a.length;i++) {
			boolean flag=false;
			
			for(int j=0;j<count;j++) {
				if(a[i]==b[j]) {
					flag=true;
					break;
				}
			}
		
		
		if(!flag) {
			b[count]=a[i];
			count++;
		}
		}
		
		
		for(int i=0;i<count;i++) {
			System.out.print(b[i]+" ");
		}
		
		
	}
}
