package com.variable;

//Operators is used to perform Mathematical operations....


public class Operators {

    // 1. Arithmetic Operators
    public void arithmeticOperators() {
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
    }

    // 2. Unary Operators
    public void unaryOperators() {
        int x = 5;
        boolean flag = true;
        System.out.println("Unary Operators:");
        System.out.println("+x = " + (+x));//means +5
      
        System.out.println("-x = " + (-x));//means -5
        System.out.println("++x = " + (++x));
        System.out.println("x++ = " + (x++));
        System.out.println("--x = " + (--x));
        System.out.println("x-- = " + (x--));
        System.out.println("!flag = " + (!flag));
       
    }

    // 3. Assignment Operators
    public void assignmentOperators() {
        int a = 10;
        System.out.println("Assignment Operators:");
        a += 5;  // a = a + 5
        System.out.println("a += 5 → " + a);
        a -= 2;
        System.out.println("a -= 2 → " + a);
        a *= 3;
        System.out.println("a *= 3 → " + a);
        a /= 4;
        System.out.println("a /= 4 → " + a);
        a %= 3;
        System.out.println("a %= 3 → " + a);
       
    }

    // 4. Relational Operators
    public void relationalOperators() {
        int a = 10, b = 20;
        System.out.println("Relational Operators:");
        System.out.println("a == b → " + (a == b));
        System.out.println("a != b → " + (a != b));
        System.out.println("a > b → " + (a > b));
        System.out.println("a < b → " + (a < b));
        System.out.println("a >= 10 → " + (a >= 10));
        System.out.println("b <= 15 → " + (b <= 15));
       
    }

    // 5. Logical Operators
    public void logicalOperators() {
        int a = 10, b = 5;
        System.out.println("Logical Operators:");
        System.out.println("a > 5 && b > 2 → " + (a > 5 && b > 2));
        System.out.println("a > 15 || b > 2 → " + (a > 15 || b > 2));
        System.out.println("!(a > 5) → " + (!(a > 5)));
        
    }

    // 6. Bitwise Operators
    public void bitwiseOperators() {
        int a = 5, b = 3;
        System.out.println("Bitwise Operators:");
        System.out.println("a & b → " + (a & b));
        System.out.println("a | b → " + (a | b));
        System.out.println("a ^ b → " + (a ^ b));
        System.out.println("~a → " + (~a));//means -a-1
        
    }

    // 7. Shift Operators
    public void shiftOperators() {
        int a = 8; // 1000 in binary
        System.out.println("Shift Operators:");
        System.out.println("a << 1 → " + (a << 1));//<<means Multiply by 2
        System.out.println("a >> 1 → " + (a >> 1));//>>means divide by 2
        System.out.println("-8 >> 1 → " + (-8 >> 1));
        System.out.println("-8 >>> 1 → " + (-8 >>> 1));
    }

    // 8. Ternary Operator means if else statement like that
    public void ternaryOperator() {
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator:");
        System.out.println("Max = " + max);
    }

   

    // Main method to run all
    public static void main(String[] args) {
        Operators obj = new Operators();
        obj.arithmeticOperators();
        obj.unaryOperators();
        obj.assignmentOperators();
        obj.relationalOperators();
        obj.logicalOperators();
        obj.bitwiseOperators();
        obj.shiftOperators();
        obj.ternaryOperator();
       
    }
}
