package de.lubowiecki.okt24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsTest {

    public static void main(String[] args) {

        // hashbar = equals und hashCode muss richtig eingebaut sein
        //Set<Integer> zahlen = new HashSet<>(); // Reihenfolge ist zufällig
        //Set<Integer> zahlen = new LinkedHashSet<>(); // Einfügereihenfolge
        Set<Integer> zahlen = new TreeSet<>(); // IMMER sortiert
        zahlen.add(7);
        zahlen.add(10);
        zahlen.add(5);
        zahlen.add(22);
        zahlen.add(-1);
        zahlen.add(-19);
        zahlen.add(0);
        System.out.println(zahlen);
        System.out.println(zahlen.add(22)); // Duplikat wird nicht hinzugefügt

        for(int i : zahlen) {
            System.out.println(i);
        }

        zahlen.forEach(e -> System.out.println(e));

        // geht nur bei Listen und Arrays
        for (int i = 0; i < zahlen.size(); i++) {
            // Set hat keine Möglichkeit für Wahlfreien-Zugriff
        }

        System.out.println();

        // TreeSet für eigene Klassen verlangt, dass die Objekte sortierbar sind
        // siehe: Comparable, Comparator
        Set<Person> personen = new HashSet<>();
        personen.add(new Person("Peter", "Parker"));
        personen.add(new Person("Peter", "Parker"));
        System.out.println(personen);

    }
}
