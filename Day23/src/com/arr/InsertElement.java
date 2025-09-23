package com.arr;
import java.util.Scanner;

public class InsertElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The array Size:");
		int siz=sc.nextInt();
		
		int el[]=new int[siz-1];
		
		for(int i=1;i<=siz;i++) {
			System.out.print("Enter Element "+i+":");
			el[i]=sc.nextInt();
		}
		
		System.out.print("Enter the Number to Insert:");
		int in=sc.nextInt();
		
		System.out.print("Enter the index to insert at (0 to "+siz+"):");
		int ind=sc.nextInt();
		
		el[ind]=in;
		
		for(int i=0;i<el.length;i++) {
			System.out.print(el[i]+" ");
		}
		
		
	}

}
