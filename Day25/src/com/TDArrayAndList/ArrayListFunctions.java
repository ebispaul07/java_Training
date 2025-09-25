package com.TDArrayAndList;
import java.util.ArrayList;

import java.util.Collections;

public class ArrayListFunctions {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("zapple");
		al.add("Apple");//1.add Element to end
		al.add("Banana");
		al.add("Orange");
		al.add("PineApple");
		
		System.out.println(al);//print element
		
		for(int i=0;i<al.size();i++) {//loop the list throw Array
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println();
		
		ArrayList<String> alist=new ArrayList<>();
		alist.addAll(al);//addall values from al to alist
		
		alist.add("Alist value:pine");
		
		System.out.println("Add All: "+alist);
		
		alist.addAll(0, al);//it is like inserting
		
		
		System.out.println("Add All index: "+alist);
		
		alist.clear();
		
		System.out.println("alist Cleared:"+alist);
		
		
		ArrayList<String>cloneArray=(ArrayList<String>) al.clone();//it creating a copy of an Array
		
		System.out.println("Cloned Array: "+cloneArray);
		
		System.out.println("Checking is it Contain: "+cloneArray.contains("Orange"));
		
		Collections.sort(al);
		
		System.out.println("Sorted Array"+al);
		
	}

}
