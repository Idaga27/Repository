package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(5);
        c.add(3);
        c.multiply(2);
        c.divide(4);
        System.out.println("Result of Calculator: " + c.getResult());

        Calculator2 c2 = new Calculator2(5);
        c2.add(3);
        c2.multiply(2);
        c2.divide(4);
        c2.sqrt();
        System.out.println("Result of Calculator2: " + c2.getResult());
    }
}