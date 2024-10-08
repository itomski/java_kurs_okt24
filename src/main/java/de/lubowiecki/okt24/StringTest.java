package de.lubowiecki.okt24;

import java.util.HashSet;
import java.util.Set;

public class StringTest {

    public static void main(String[] args) {

        String msg = "Hallo";
        msg = msg.toLowerCase();
        System.out.println(msg);

        msg = "Hallo";
        var msg1 = "Hallo";
        System.out.println(msg == msg1); // Referenzvergleich
        System.out.println(msg.equals(msg1)); // Inhaltsvergleich

        String msg2 = new String("Hallo");
        System.out.println(msg.equals(msg2)); // Zwei unterschiedliche Objekte auf dem Heap

        // API Contract: Wenn zwei Objekt mit equals gleich sind,
        // müssen diese auch den gleichen HashCode liefern

        System.out.println();

        System.out.println(msg.hashCode());
        System.out.println(msg1.hashCode());
        System.out.println(msg2.hashCode());

        System.out.println();

        Object o1 = new Object();
        System.out.println(o1.hashCode());
        Object o2 = new Object();
        System.out.println(o2.hashCode());
        Object o3 = new Object();
        System.out.println(o3.hashCode());

        System.out.println();

        Person p1 = new Person();
        p1.setVorname("Peter");
        p1.setNachname("Parker");

        Person p2 = new Person();
        p2.setVorname("Peter");
        p2.setNachname("Parker");

        Person p3 = new Person();
        p3.setVorname("Bruce");
        p3.setNachname("Banner");

        System.out.println(p1 == p2); // false
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println("---------------");

        // Hash basierte Datenstrukturen
        Set<Person> personen = new HashSet<>(); // Menge: Keine Duplikate!

        personen.add(p1);
        personen.add(p2);
        personen.add(p3);

        System.out.println(personen);
    }
}
