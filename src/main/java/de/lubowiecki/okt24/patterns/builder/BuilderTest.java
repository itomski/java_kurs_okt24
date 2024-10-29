package de.lubowiecki.okt24.patterns.builder;

import java.time.LocalDate;

public class BuilderTest {

    public static void main(String[] args) {

//        StringBuilder sb = new StringBuilder();
//        sb.append("ABC");
//        System.out.println(sb.toString());
//        sb.append("DEF");
//        System.out.println(sb.toString());

        Kunde k1 = new Kunde("Peter", "Parker", LocalDate.of(1995, 10, 5), KundenArt.PRIVATKUNDE);
        System.out.println(k1);

        Kunde k2 = new Kunde("Bruce", "Banner", LocalDate.of(1995, 10, 5), KundenArt.PRIVATKUNDE);
        System.out.println(k2);

        System.out.println();

        KundenBuilder kb = new KundenBuilder();
        kb.setVorname("Peter")
                .setArt(KundenArt.GESCHAEFTSKUNDE)
                .setGeburtsDatum(LocalDate.now());

        kb.setNachname("Banner");
        kb.setVorname("Carol");

        Kunde k3 = kb.build();
        System.out.println(k3);

        Kunde k4 = kb.build();
        System.out.println(k4);

        kb.setVorname("Peter");
        Kunde k5 = kb.build();
        System.out.println(k5);
    }
}
