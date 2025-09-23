package com.arraystudy;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},
				{1,2,5,2},
				{7,5,9,7}};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum=sum+a[i][j];
			}
			 
		}
		
		
		System.out.println(sum);
		
	}

}
