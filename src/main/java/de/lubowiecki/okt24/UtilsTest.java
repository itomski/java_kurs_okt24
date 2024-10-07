package de.lubowiecki.okt24;

import java.util.Arrays;
import java.util.Objects;

public class UtilsTest {

    public static void main(String[] args) {

        double x = Math.pow(2,5);
        System.out.println(x);

        Person p = new Person();
        p.setVorname("Tony");
        p.setNachname("Stark");

        // Konstruktor ist privat
        // PersonUtil pu = new PersonUtil();
        PersonUtil.print(p);

    }

    // Methoden sind Funktionen, die zu einer Klasse gehören
}

/*

// Funktionen gibt es nicht in Java!!!
// Funktionen sind frei
function plus(a, b) {
    return a + b;
}

x = plus(10, 15);
*/