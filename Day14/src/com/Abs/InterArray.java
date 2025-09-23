package com.Abs;

import java.util.Scanner;

public class InterArray {
	
	public void sortAD() {
		int a[]= {5,4,2,8,11,90,1};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Decending Order:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public void LenearSearcharr() {
		Scanner sc =new Scanner(System.in);
		int a[]= {1,42,2,7};
		
		System.out.println();
		System.out.print("Enter Number To Search:");
		int sin=sc.nextInt();
		sc.nextLine();
		
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==sin) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Element Found:"+sin);
		}else {
			System.out.println("Element Not Found!!");
		}
	}
	
	
	public void BinarySearch() {
		Scanner sc=new Scanner(System.in);
		
		
		int a[]= {8,33,2,5,6,1,77,29,34};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.print("Enter An Element To Search:");
		int sin=sc.nextInt();
		sc.nextLine();
		
		
		
		int mid=a.length/2;
		int midE=a[mid];
		System.out.println(midE);
		
		if(sin==midE) {
			System.out.println("Element Found!!");
		}else if(sin<midE) {
			for(int i=0;i<mid;i++) {
				if(a[i]==sin) {
					System.out.println("Element Found Left Half");
				}
			}
		}else if(sin>midE) {
			for(int i=mid;i<a.length;i++) {
				if(a[i]==sin) {
					System.out.println("Element Found Right Half");
				}
			}
		}else {
			System.out.println("Element Not Found");
		}
		
		
		
		
	}
	
	public void copyArr() {
		int a[]= {8,3,2,1,9};
		
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		System.out.println();
		System.out.println("Copy Array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	public void remDupli() {
		int a[]= {1,2,3,4,4,5,5,8};
		
		int b[]=new int[a.length];
		int c=0;
		
		for(int i=0;i<a.length;i++) {
			boolean flag=false;
			
			for(int j=0;j<c;j++) {
				if(a[i]==b[j]) {
					flag =true;
					break;
				}
			}
			
			if(!flag) {
				b[c]=a[i];
				c++;
			}
			
		}
		
		System.out.println();
		for(int i=0;i<c;i++) {
			System.out.print(b[i]+" ");
		}
		
	}
	
	public void arraylefRotate() {
		int a[]= {1,2,3,4,5};
		int k=2;
		
		System.out.println();
		for(int i=k;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<k;i++) {
			System.out.print(a[i]+" ");
		}
		
		
	}
	
	public void arrayrigRotate() {
		int a[]= {1,2,3,4,5};
		int k=2;
		
		
		System.out.println();
		for(int i=a.length-k;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<=k;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
		InterArray i=new InterArray();
		i.sortAD();
		//i.LenearSearcharr();
		//i.BinarySearch();
		i.copyArr();
		i.remDupli();
		i.arraylefRotate();
		i.arrayrigRotate();
	}
}
