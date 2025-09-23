package com.variable;

public class variableTypes {
	
    int a = 50;           // instance variable
    static int b = 100;     // static variable

    public void show() {
    	
        int localVar = 10;          // local variable
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + a);
        System.out.println("Static Variable: " + b);
    }

    public static void main(String[] args) {
        variableTypes obj1 = new variableTypes();
        obj1.show();

        variableTypes obj2 = new variableTypes();
        obj2.a= 200;

        System.out.println("Obj1 instanceVar: " + obj1.a);
        System.out.println("Obj2 instanceVar: " + obj2.a);
        System.out.println("Static Variable (shared): " + variableTypes.b);
        
        final String str="EBI S PAUL";//final Variable
        
       // str="emi";// if we reassign it will cause error
        
        System.out.println("FInal Variable :"+str);
        
        
    }
}
