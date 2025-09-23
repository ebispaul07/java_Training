package com.enu;

enum Signal{
	red("stop"),
	Yellow("Sart"),
	green("Go");
	
	private String action;
	
	Signal(String action) {
		this.action=action;
	}
	
	public String getAction() {
		return action;
	}
	
}

public class SampleEnum {
	
	public static void main(String[] args) {
		
		Signal a[]=Signal.values();
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" : "+a[i].getAction());
		}
		
		
	}
}
 