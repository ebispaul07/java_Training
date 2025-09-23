/*Create an interface Bank with methods deposit() and withdraw().
Implement two classes SBI and HDFC.
Call the methods using interface reference.*/
package com.Poly;


interface Bank{
	void deposit();
	void withdraw();
}

class SBI implements Bank{
	public void deposit() {
		System.out.println("SBI Deposit Done");
	}
	
	public void withdraw() {
		System.out.println("SBI Withdraw done");
	}
	
}

class HDFC implements Bank{
	public void deposit() {
		System.out.println("HDFC Deposit Done");
	}
	
	public void withdraw() {
		System.out.println("HDFC Withdraw done");
	}
	
}




public class Interface {

	public static void main(String[] args) {
		
		Bank b=new SBI();
		b.deposit();
		b.withdraw();
		
		Bank h=new HDFC();
		h.deposit();
		h.withdraw();
		
		

	}

}
