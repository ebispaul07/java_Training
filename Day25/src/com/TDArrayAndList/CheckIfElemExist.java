package com.TDArrayAndList;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckIfElemExist {
	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<>();
		al.add("Apple");
		al.add("Orange");
		al.add("Pine");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Element to Search:");
		String in=sc.nextLine();
		
		System.out.println(al.contains(in));
		
		sc.close();
	}

}
