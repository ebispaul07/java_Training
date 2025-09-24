package com.TDarray;

public class SortEntire2DArray {
	public static void main(String[] args) {
		
		int a[][]= {{8,4,3},{5,1,2}};
		
		int r=a.length;
		int c=a[0].length;
		
		
		int ar[]=new int[r*c];
		int count=0;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				ar[count++]=a[i][j];
			}
		}
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length-1;j++) {
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		
		count=0;
		
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=ar[count++];
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}
