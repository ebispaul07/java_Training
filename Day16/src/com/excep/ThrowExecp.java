package com.excep;

public class ThrowExecp {
	
	public void withdraw(int amount,int balance) {
		if(amount>balance) {
			throw new RuntimeException("Insuffient balance");
		}else {
			System.out.println("Successfully Withdraw");
		}
	}
	
	public static void main(String[] args) {
		
		ThrowExecp t=new ThrowExecp();
		t.withdraw(1000, 500);
		
	}

}
