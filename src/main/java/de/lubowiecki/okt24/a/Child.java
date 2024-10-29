package de.lubowiecki.okt24.a;

import java.util.List;
import java.util.Set;

public class Child extends Parent { // Hier nur public und default möglich

    public static void main(String[] args) {

        // public int y = 100; // Hier keine Access-Modifier

        Child ch1 = new Child();
        System.out.println(ch1.x); // Sichtbar, da Child IS-A Parent

        Parent p1 = new Parent();

        //Ok, da beide Klassen im gleichen Package liegen
        System.out.println(p1.x); // Sichtbar, da protected offener ist als package-private


        //List<String> namen = List.of("Peter", "Carol", "Bruce");
        Set<String> namen = Set.of("Peter", "Carol", "Bruce");

        for (int i = 0; i < namen.size() ; i++) {
            // System.out.println(namen.get(i)); // Nur List hat eine get-Methode
        }

        for (String n : namen) {
            System.out.println(n);
        }

        final boolean ok;
        ok = false;

        while(ok) {
        }
        System.out.println("Moin");


    }

    // Kann auch static sein
    class Sub { // Innere Klasse: Kann private, default, protected oder private sein
    }
}
