package com.oops;

import java.util.Scanner;

class Atm{
	private int accountNumber;
	private int balance;
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void deposit() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Account Number:");
		int Acno=sc.nextInt();
		
		
		System.out.print("Enter Deposit Amount:");
		int de=sc.nextInt();
		
		if(de<0) {
			System.out.println("Invalid Amount");
			
		}
		
		setBalance(de);
		
		System.out.println("Deposited Amount:"+de);
		
		
	}
	
	public void withdraw() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter WithDraw Amount:");
		int wr=sc.nextInt();
		
		if(wr<=balance) {
			int bal=balance-wr;
			
			System.out.println("WithDraw Amount:"+wr);
			System.out.println("Balance Amount:"+bal);
		}else {
			System.out.println("Insufficient Balance!!!");
		}
		
	}
	
	
	
}




public class Bank {
		
	public static void main(String[] args) {
		
		
		Atm a=new Atm();
		
		
		
		a.deposit();
		a.withdraw();
		
		
		
	}
	
}
