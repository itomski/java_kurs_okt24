package de.lubowiecki.okt24;

public class CastTest {

    public static void main(String[] args) {

        Child1 ch1 = new Child1();
        Parent p = ch1; // komplex widening
        Child2 ch2 = (Child2) p; // ClassCastException. Das Objekt auf dem Heap ist ein Child1
    }
}

class Parent {

}

class Child1 extends Parent {

}

class Child2 extends Parent {

}