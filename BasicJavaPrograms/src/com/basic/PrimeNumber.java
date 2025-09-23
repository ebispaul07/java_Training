package com.basic;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int num=2;
		
		boolean flag=true;
		
		
		if(num<=1) {
			flag=false;
		}else {
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
			}
		}
		
		if(flag) {
			System.out.println("Prime");
			
		}else {
			System.out.print("Not Prime");
		}
		
	}
	
}
