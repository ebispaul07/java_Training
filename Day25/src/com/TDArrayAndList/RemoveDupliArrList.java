package com.TDArrayAndList;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDupliArrList {
	public static void main(String[] args) {
		  ArrayList<Integer>al=new ArrayList<>();
			
			al.add(1);
			al.add(2);
			al.add(2);
			al.add(4);
			al.add(5);
			al.add(7);
			al.add(7);
			
			System.out.println("Original ArrayList:"+al);
			
			HashSet<Integer>h=new HashSet<>(al);
			
			ArrayList<Integer>nal=new ArrayList<>(h);
			
			System.out.println("After Remove Dupli:"+nal);
	}

}
