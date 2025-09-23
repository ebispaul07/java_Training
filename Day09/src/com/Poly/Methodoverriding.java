package com.Poly;

class India{
	static void speaking() {
		System.out.println("I Can Speak indian Language");
	}
}

class Tamilnadu extends India{
	static void speaking() {
		System.out.println("I can Speak Tamil");
	}
}


public class Methodoverriding {
	public static void main(String[] args) {
		
		India.speaking();
		Tamilnadu.speaking();
		
		
	}
	

}
