package com.Array;

import java.util.Scanner;

public class Searchelem {
	public static void main(String[] args) {
		
		String s[]= {"apple","Banana","fig"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element to Search:");
		String sin=sc.nextLine();
		
		boolean flag=false;
		
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(sin)) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Item Found"+sin);
		}else {
			System.out.println("Item Not Found:"+sin);
		}
		
		
		
	}

}
