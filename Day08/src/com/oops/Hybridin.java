package com.oops;

interface A{
	default void a() {
		System.out.println("I am From A");
	}
}

interface B extends A{
	default void b() {
		System.out.println("I am From B");
	}
}

class C implements A{
	void c() {
		System.out.println("I am From C");
	}
}

class D implements A,B{
	void d() {
		System.out.println("I am From D");
	}
}


public class Hybridin {
	public static void main(String[] args) {
		D dd=new D();
		dd.a();
		dd.b();
		dd.d();
		
		
		
		
	}

}
