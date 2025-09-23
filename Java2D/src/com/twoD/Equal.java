package com.twoD;

public class Equal {
	public static void main(String[] args) {
		int a[][]= {{2,3,1},{4,5,6},{9,8,7}};
		
		int b[][]= {{2,3,1},{4,5,6},{9,8,7}};
		
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
