package de.lubowiecki.okt24;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionsUndStreams {

    public static void main(String[] args) {

        Random rand = new Random();

        List<Integer> zahlen = new ArrayList<>();
        for (int i = 0; i < 100_000_000 ; i++) {
            zahlen.add(rand.nextInt(100) + 1);
        }

        Predicate<Integer> pred = e -> e >= 90 && e <= 95;

        Instant start = Instant.now();
        zahlen.removeIf(pred);
        for(int i = 0; i < zahlen.size() ; i++) {
            zahlen.set(i, zahlen.get(i) * 10);
        }
        Instant end = Instant.now();

        System.out.println(Duration.between(start, end).toMillis() + "ns");

        start = Instant.now();
        List<Integer> auswahl = zahlen.parallelStream()
                                        .filter(pred.negate())
                                        .map(e -> e * 10)
                                        // weitere Aktionen
                                        .collect(Collectors.toList());
        end = Instant.now();

        System.out.println(Duration.between(start, end).toMillis() + "ns");
    }
}
