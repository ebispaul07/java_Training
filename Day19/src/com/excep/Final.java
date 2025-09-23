package com.excep;

public class Final {
	
	public void finallyDemo(){
		
		try {
			System.out.println("TryBlock");
			return;
		}catch(Exception e) {
			System.out.println("CatchBlock");
		}finally {
			System.out.println("Finally Block");
		}
		
		System.out.println("outside Block");
	}
	
	public static void main(String[] args) {
		Final f=new Final();
		f.finallyDemo();
	}

}
