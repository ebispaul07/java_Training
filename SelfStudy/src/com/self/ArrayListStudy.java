package com.self;

import java.util.ArrayList;





public class ArrayListStudy {
	
	public void printAL() {
		ArrayList <Integer> num=new ArrayList<>();
		
		
		
		num.add(1);
		num.add(2);
		num.add(9);
		num.add(4);
		num.add(5);
		
		System.out.println(num);
		
		int max=num.get(0);
		
		for(int i=0;i<num.size();i++) {
			if(num.get(i)<max) {
				max=num.get(i);
			}
		}
		
		System.out.println(max);
		
		
		
		
	}

	
	public static void main(String[] args) {
		
		ArrayListStudy a=new ArrayListStudy();
		a.printAL();
		
		
	}
}
