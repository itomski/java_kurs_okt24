package de.lubowiecki.okt24;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InterfaceTest5 {

    static int i = 20;

    public static void main(String[] args) {

        SampleFuncInterface sfi = (a, b) -> (int)(a * b);

        Abcde a1 = new Abcde(10, 20);

        // Reflection gibt die Möglichkeit dynamisch den Inhalt von Klassen zu ermitteln

        Class<?> c = a1.getClass();
        System.out.println(c.getName());

        for(Method m : c.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        for(Field f : c.getDeclaredFields()) {
            System.out.println(f.getName());
        }

        Byte b = 123;
        //System.out.println(b.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.SIZE);

        {
            int i = 100; // 1
            {
                // int i = 50; // Error: hier ist das i von 1 noch sichtbar
            }
            System.out.println(i); // Lokale Variable überlagert die statische variable
        }
        System.out.println(i); // Statische Variable wieder sichtbar
        int i = 200;


    }
}

@FunctionalInterface
interface SampleFuncInterface {

    int calc(double a, double b);

    // Das Interface ist kein SAM (Single Abstract Method) mehr. Kann für Lambda nicht benutzt werden
    // int calc(double... v);

    @Override
    String toString(); // Alle Methoden von Object ist für FunctionalInterfaces neutral

    // Alle Methoden von Object dürfen nicht als default-Methoden eingebaut werden!!!!
//    default int hashCode() {
//        return 123;
//    }
}

class Abcde {

    private int a;
    private int b;

    public Abcde(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Abcde() {
    }

    public void print() {
        System.out.println(a + ", " + b);
    }
}
