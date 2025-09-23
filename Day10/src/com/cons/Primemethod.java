package com.cons;

public class Primemethod {
	
	static void prime(int num) {
		
		
		
		
		for(int i=1;i<=num;i++) {
			boolean flag=true;
			if(i<=1) {
				flag=false;
			}else {
				for(int j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						flag=false;
						
					}
				}
			}
			
			if(flag) {
				System.out.println("Number:"+i+" is Prime.");
			}else {
				System.out.println("Number:"+i+" is Not Prime.");
			}
			
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		int num=29;
		
		prime(num);
		
		
	}

}
