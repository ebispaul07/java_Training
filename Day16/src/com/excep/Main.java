package com.excep;

public class Main {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int div=a/b;
			System.out.println(div);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("final");
		
		}
		}

}
