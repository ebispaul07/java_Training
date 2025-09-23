package com.arr;
import java.util.Scanner;

public class SearchElementArray {
	public static void main(String[] args) {
		
		String Fruits[]= {"Apple","Mango","Orange","BlueBerry"};
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Fruits to Search:");
		String in=sc.nextLine();
		
		boolean flag=false;
		
		for(int i=0;i<Fruits.length;i++) {
			if(in.equalsIgnoreCase(Fruits[i])) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Item Found "+in);
		}else {
			System.out.println("Item Not Found "+in);
		}
		
		sc.close();
		
	}
}