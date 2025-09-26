package com.arrlinked;

public class FindPair {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		
		int t=6;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]+a[j]==t) {
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
		
	}

}
