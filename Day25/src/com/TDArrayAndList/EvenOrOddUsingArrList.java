package com.TDArrayAndList;

import java.util.ArrayList;

public class EvenOrOddUsingArrList {
	public static void main(String[] args) {

		ArrayList<Integer>al=new ArrayList<>();
		
		al.add(3);
		al.add(2);
		al.add(9);
		al.add(1);
		
		for(int x:al) {
			if(x%2==0) {
				System.out.println("Even: "+x);
			}else {
				System.out.println("Odd:"+x);
			}
		}
		
		
	}
}
