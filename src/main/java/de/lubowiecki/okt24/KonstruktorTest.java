package de.lubowiecki.okt24;

import org.apache.poi.ss.formula.functions.T;

import java.time.LocalDate;

public class KonstruktorTest {

    public static void main(String[] args) {

        //TestClass1 tc1 = new TestClass1(); // Error:  kein default Konstruktor mehr vorhanden
        TestClass1 tc1 = new TestClass1(123);

        // Record ist immutable
        Kunde k1 = new Kunde("Peter", "Parker");
        Kunde k2 = new Kunde("Peter", "Parker");
        System.out.println(k1.equals(k2));
        System.out.println(k1.hashCode());
        System.out.println(k2.hashCode());

        System.out.println();

        TestClass1[] arr = {new TestClass1(), new TestClass1()};
        arr[0].i = 20;

        System.out.println();

        for(TestClass1 tc : arr) {
            tc = new TestClass1(); // lokale Referenz tc zeigt auf ein neues Objekt
            //tc.i = 30;
        }

        for(TestClass1 tc : arr) {
            System.out.println(tc.i);
        }

        Aa a1 = new Ab(); // Ab IS-A Aa
        Aa[] aArr = new Ab[10]; // Ab IS-A Aa

        Object[] oArr = new String[10]; // komplex Widening ist zugelassen
        Object obj = new String[10];

        //int[] iArr = new byte[10]; // Error: bei Arrays kein primitive widening


        Byte b1 = 100;
        Long l1 = (long)100;
        Float f1 = (float)(b1 + l1);


        /*
        release = b1.equals(b2) ? (b1 == b2 ? LocalDate.of(2050,12,12) : LocalDate.parse("2072-02-01"))
                                : LocalDate.parse("9999-09-09");

         */

        // System.out.println(LocalDate.MAX);

//        boolean test = false;
//
//        while(test)
//            System.out.println("Moin");
//        test = true;
//
//        do {
//            System.out.println("Moin");
//            test = true;
//        }
//        while(test);

        Object o = "Hallo Welt";
        if(o instanceof String) {
            String s = (String)o;
            System.out.println(s.toLowerCase());
        }

        if(o instanceof String s) { // Ab Java 19
            System.out.println(s.toLowerCase());
        }

        if(o instanceof String s && s.length() > 2) { // Ab Java 19
            System.out.println(s.toLowerCase());
        }

    }
}

interface Aa {

}

class Ab implements Aa {

}

class TestClass1 {

    public int i = 10;

    public TestClass1(int i) {
        this.i = i;
    }

    public TestClass1() {
        System.out.println("C");
    }
}

record Kunde(String vorname, String nachname) {
}
