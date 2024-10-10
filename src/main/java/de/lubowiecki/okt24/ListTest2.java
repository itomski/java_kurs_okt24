package de.lubowiecki.okt24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>();
        boolean eingefuegt = zahlen.add(500); // Einfügen an der nächsten freien Stelle
        System.out.println(zahlen.size()); // Anzahl Elemente
        zahlen.add(0, 200); // Fügt ein Element an eine gewünsche Stelle ein

        //zahlen.add(100, 300); // Exception: Index 100 ist nicht vorhanden

        zahlen.set(0, 100); // Ersetzt das Element an gewüschter Position

        zahlen.add(0, 800);

        // TODO: Aufgabe 1
        // Aufgabe: Probiert die nachfolgenden Methoden aus

        // addAll()
        // clear()
        // remove()
        // removeAll()
        // retainAll()
        // toArray()

        // TODO: Aufgabe 2
        // Aufgabe: Schreibt eine Klasse die einen Kartendeck simuliert
        // In einer Liste befinden sich einige Spielkarten
        // Mische das Deck durch

        //Collections.binarySearch();
        //Collections.shuffle();
        //Collections.reverse();

        Collections.sort(zahlen); // Liste sortieren
        System.out.println(zahlen);

        System.out.println();

        // Funktioniert bei Arrays und Listen
        for (int i = 0; i < zahlen.size(); i++) {
            System.out.println(zahlen.get(i));
        }

        System.out.println();

        // Funktioniert bei allen Collections
        for (int i : zahlen) {
            System.out.println(i);
        }

        System.out.println();

        // Funktioniert bei allen Collections
        zahlen.forEach(e -> System.out.print(e + ", "));

        System.out.println();

        // Funktioniert bei allen Collections
        Iterator<Integer> itr = zahlen.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
