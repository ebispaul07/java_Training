package com.TDArrayAndList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInJava {
	public static void main(String[] args) {
		
		ArrayList<String> alist=new ArrayList<>();
		
		alist.add("Apple");
		alist.add("Banana");
		alist.add("PineApple");
		
		Iterator<String>it=alist.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
