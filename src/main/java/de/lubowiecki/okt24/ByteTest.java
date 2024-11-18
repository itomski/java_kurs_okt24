package de.lubowiecki.okt24;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ByteTest {

    public static void main(String[] args) {

        Long l1 = 127l; // long autoboxing zu Long
        // Long l2 = 100; // Error: int autoboxing zu Integer
        // Long l2 = (long)100;
        Long l2 = 127l;
        long l3 = 100; // int primitive widening long

        System.out.println(l1.equals(l2));
        // Byte-Pool: Für alle ganzzahligen Wrapper von -128 bis 127
        System.out.println(l1 == l2);

        System.out.println();

        String s1 = "Moin"; // landet im Pool
        String s2 = "Moin"; // referenziert das Objekt aus dem Pool
        String s3 = new String("Moin"); // verwendet NICHT den Pool. Ein neues Objekt
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);

        /*
        == bei primitiven vergleicht den Inhalt
        == bei komplexen vergleicht die Referenz
        equals bei komplexen vergleicht den Inhalt (außer in der Klasse Object oder dort wo equals nicht überschrieben wurde)
         */

        LocalDate ld = LocalDate.now();
        ld.plus(10, ChronoUnit.DAYS);
        Period zeitraum = Period.of(2, 10, 7);
        ld = ld.plus(zeitraum);

        int[] arr = new int[10];

    }
}
