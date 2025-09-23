package com.basic;

public class Armstrong {
	public static void main(String[] args) {
		int num=153;
		
		int temp=num;
		
		int len=Integer.toString(num).length();
		
		
		
		
		
		double sum=0;
		
		while(num!=0) {
			int digit=num%10;
			sum=sum+Math.pow(digit, len);
			num=num/10;
		}
		
		if(sum==temp) {
			System.out.print("A");
		}else {
			System.out.print("not A");
		}
		
		
		
		
	}

}
