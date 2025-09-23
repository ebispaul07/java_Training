package com.enu;

enum PaymentMode{
	CreditCard(2.0),
	DebitCard(1.0),
	UPI(0.5),
	Cash(0.0);
	
	private double fee;
	
	PaymentMode(double fee){
		this.fee=fee;
	}
	
	public double getFee() {
		return fee;
	}
	
}

interface Payment{
	
	public void processPayment(double amount);
}

class CreditCard implements Payment{
	
	public void processPayment(double amount) {
		double fee=amount*PaymentMode.CreditCard.getFee()/100;
		
		System.out.println("Paid by Cred....Fee:"+fee);
		System.out.println("Total Amount including Fee:"+amount+fee);
	}
}

class DebitCard implements Payment{
	
	public void processPayment(double amount) {
		double fee=amount*PaymentMode.DebitCard.getFee()/100;
		
		System.out.println("Paid by Cred....Fee:"+fee);
		System.out.println("Total Amount including Fee:"+amount+fee);
	}
}

class UPI implements Payment{
	
	public void processPayment(double amount) {
		double fee=amount*PaymentMode.UPI.getFee()/100;
		
		System.out.println("Paid by Cred....Fee:"+fee);
		System.out.println("Total Amount including Fee:"+amount+fee);
	}
}

class Cash implements Payment{
	
	public void processPayment(double amount) {
		double fee=amount*PaymentMode.Cash.getFee()/100;
		
		System.out.println("Paid by Cred....Fee:"+fee);
		System.out.println("Total Amount including Fee:"+amount+fee);
	}
}

public class EnumPaymentSystem {
	public static void main(String[] args) {
		
		double amt=1000;
		
		Payment p;
		
		PaymentMode m=PaymentMode.UPI;
		
		p=new UPI();	
		
		p.processPayment(amt);
	}

}
