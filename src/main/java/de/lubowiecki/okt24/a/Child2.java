package de.lubowiecki.okt24.a;

import de.lubowiecki.okt24.b.Parent2;

public class Child2 extends Parent2 {

    public static void main(String[] args) {

        Child2 ch1 = new Child2();
        System.out.println(ch1.x); // Sichtbar, da Child IS-A Parent

        Parent2 p1 = new Parent2();
        //Ok, da beide Klassen NICHT im gleichen Package liegen
        // System.out.println(p1.x); // Und keine Vererbung: Compiler-Error
    }
}
