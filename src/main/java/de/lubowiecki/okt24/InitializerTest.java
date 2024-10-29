package de.lubowiecki.okt24;

public class InitializerTest {

    // Klassenvariable
    static final int zahlA;

    // Instanzvaribale
    final int zahlB;

    // Static Initializer: Ausführung beim laden der Klasse
    static {
        System.out.println("S I");
        zahlA = 200;
    }

    // Instanz Initializer: Ausführung vor dem Konstruktor
    {
        System.out.println("I I");
        zahlB = 500;
    }

    public InitializerTest() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        /*
        new InitializerTest();
        new InitializerTest();
        new InitializerTest();
        new InitializerTest();
        */

        System.out.println();

        C c = new C();

    }

    private void start() {
        System.out.println(zahlA);
        System.out.println(zahlB);
    }
}


class A {
    static {
        System.out.println("SI: A");
        int[] arr = new int[3];
        arr[4] = 100;
    }

    {
        System.out.println("II: A");
    }

    public A() {
        System.out.println("C: A");
    }
}

class B extends A {

    static {
        System.out.println("SI: B");
    }

    {
        System.out.println("II: B");
    }

    public B() {
        System.out.println("C: B");
    }
}

class C extends B {

    static {
        System.out.println("SI: C");
    }

    {
        System.out.println("II: C");
    }

    public C() {
        System.out.println("C: C");
    }
}
