package de.lubowiecki.okt24;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> zufallsZahlen = new ArrayList<>();

        /*
        while(true) {
            int zahl = rand.nextInt(6) + 1;
            System.out.println(zahl);
            zufallsZahlen.add(zahl);
        }
        */

        /*
        Integer i1 = 127;
        Integer i2 = 127;

        // Byte Pool (Ganzzahlen im Umfang von -128 bis 127)

        System.out.println(i1 == i2); // Referenzvergleich
        System.out.println(i1.equals(i2)); // Inhaltsvergleich
        */

        // Supplier<Integer>: T get()
        // Consumer<Integer>: void accept(T t)
        Stream.generate(() -> rand.nextInt(6) + 1)
                .map(v -> v * 10) // Veränderung
                .filter(v -> v != 50)
                .limit(100)
                .forEach(v -> System.out.println(v));


        Predicate<Integer> pred = v -> v != 50;

        List<Integer> zahlen = Stream.generate(() -> rand.nextInt(6) + 1)
                .map(v -> v * 10) // Veränderung
                .filter(pred)
                .limit(100)
                .collect(Collectors.toList());

        System.out.println(zahlen);
    }
}
