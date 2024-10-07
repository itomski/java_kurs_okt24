package de.lubowiecki.okt24;

public class OverloadingTest {

    public static void main(String[] args) {

        // Ganzzahlen Literale sind immer int
        // Fließkommazahlen Literale sind immer double
        byte b = 100;
        //doSomething(b);
        doSomething(100);

        doSomething(012);

        long x = 100_000_000_000l;


    }

    private static void doSomething(byte v) {
        System.out.println("byte");
    }

    private static void doSomething(short v) {
        System.out.println("short");
    }

    /*
    private static void doSomething(int v) {
        System.out.println("int");
    }

    private static void doSomething(float v) {
        System.out.println("float");
    }

    private static void doSomething(double v) {
        System.out.println("double");
    }

    private static void doSomething(Integer i) {
        System.out.println("Integer");
    }
    */

    private static void doSomething(Double i) {
        System.out.println("Double");
    }

    private static void doSomething(Number i) {
        System.out.println("Number");
    }
}
