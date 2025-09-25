package com.TDArrayAndList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	
	public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		
		
		//using collecctions
		
		Collections.reverse(al);
		
		System.out.println("Reverse: "+al);
		
		
		Collections.sort(al);
		
		System.out.println("Sort: "+al);
		
	}

}
