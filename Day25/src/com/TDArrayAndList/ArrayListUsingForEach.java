package com.TDArrayAndList;

import java.util.ArrayList;

public class ArrayListUsingForEach {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Ebi");
		al.add("emi");
		al.add("Ebi S paul");
		al.add("Emi S paul");
		
		for(String name:al) {
			System.out.println(name);
		}
		
		
	}
}
