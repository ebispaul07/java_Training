package com.TDArrayAndList;

import java.util.ArrayList;
import java.util.Collections;

public class MaxAndMinUsingArrList {
	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<>();
		
		al.add(30);
		al.add(20);
		al.add(90);
		al.add(10);
		
		int max=0;
		
		for(int m:al) {
			if(m>max) {
				max=m;
			}
		}
		
		System.out.println("Max using for each: "+max);
		
		
		System.out.println("Min using Collection: "+Collections.min(al));
	}

}
