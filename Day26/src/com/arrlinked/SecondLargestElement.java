package com.arrlinked;

public class SecondLargestElement {
	public static void main(String[] args) {
		int a[]= {1,5,4,2,7};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Second Largest Element:");
		
		for(int i=1;i<2;i++) {
			System.out.print(a[i]);
		}
		
	}

}
