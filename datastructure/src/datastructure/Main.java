package datastructure;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
			
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(25);
		
		int max=a.get(0);
		
		for(int i=0;i<a.size();i++) {
			if(max<a.get(i))
			max=a.get(i);
		}
		
		System.out.println(max);
		
		}
}
