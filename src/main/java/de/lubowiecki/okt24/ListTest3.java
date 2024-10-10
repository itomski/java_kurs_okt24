package de.lubowiecki.okt24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest3 {

    public static void main(String[] args) {

        // Fixed Size Liste
        List<Integer> zahlen = List.of(); // Arrays.asList()

        // Veränderbare Liste
        List<Integer> andereZahlen = new ArrayList<>(List.of(2,7,9,22,18,17,100,-7,9));

        Collections.sort(andereZahlen);

        System.out.println(andereZahlen);
        System.out.println(Collections.binarySearch(andereZahlen, 7));

        // Position von 23 wäre Index 8.
        // Da nicht da, wird der Wert im Minus wiedergegeben + -1
        System.out.println(Collections.binarySearch(andereZahlen, 23));

    }
}
