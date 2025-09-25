package com.TDArrayAndList;

import java.util.ArrayList;

public class ReplaceFromArrayList {
	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<>();
		al.add("Apple");
		al.add("Orange");
		al.add("Pine");
		
		System.out.println("Before Replace : "+al);
		
		al.set(0, "Banana");
		System.out.println("After Replace : "+al);
		
		al.remove(1);
		
		System.out.println("After Remove : "+al);
		
	}
}
