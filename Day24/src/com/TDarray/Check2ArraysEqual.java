package com.TDarray;

public class Check2ArraysEqual {
	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{1,2,3},{4,3,6}};
		
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]!=b[i][j]) {
					flag=false;
					break;
				}
			}
		}
		
		if(flag) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
	}
}
