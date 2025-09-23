package com.excep;

public class throwSample {
	
	public void ageChecker(int age) {
		
		if(age<18) {
			
			throw new IllegalArgumentException("Only about 18 is allowed to vote");
		}else {
			System.out.println("You Are Eligible");
		}
		
	}
	
	public static void main(String[] args) {
		
		throwSample t=new throwSample();
		int age=9;
		
		t.ageChecker(age);
		
	}

}
