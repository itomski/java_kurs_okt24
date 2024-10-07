package de.lubowiecki.okt24;

import java.time.LocalDate;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setVorname("Peter");
        p1.setNachname("Parker");
        p1.setGeburtsDatum(LocalDate.now());
        p1.setRaucher(true);

        System.out.println(p1); // p.toString() wird automatisch verwendet

        Person p2 = new Person();
        p2.setVorname("Bruce");
        p2.setNachname("Banner");
        p2.setGeburtsDatum(LocalDate.now());
        p2.setRaucher(false);

        System.out.println(p2);

        Object o;
    }
}
