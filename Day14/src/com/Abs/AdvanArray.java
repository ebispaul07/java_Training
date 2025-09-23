package com.Abs;

public class AdvanArray {
	
	public void secondLS() {
		int a[]= {9,33,1,2,3,4,5};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Second Smallest Number:"+a[1]);
		System.out.println("Second Largest Number:"+a[a.length-2]);
		
	}
	
	public static void main(String[] args) {
		AdvanArray a=new AdvanArray();
		a.secondLS();
	}

}
