package de.lubowiecki.okt24;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsTest3 {

    public static void main(String[] args) {

        Map<String, Integer> einwohner = new HashMap<>();

        einwohner.put("München", 1_400_000);
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("Berlin", 3_900_000);
        einwohner.put("Kiel", 400_000);
        einwohner.put("Leipzig", 800_000);

        System.out.println(einwohner);

        System.out.println(einwohner.get("Hamburg"));
        System.out.println(einwohner.get("Ülzen"));
        System.out.println(einwohner.getOrDefault("Ülzen", 0));
        System.out.println(einwohner.getOrDefault("Kiel", 0));

        System.out.println(System.getProperty("user.home"));

        System.out.println();

        // MiniCal
        Map<LocalDate, String> miniCal = new TreeMap<>(); // Treemap ist nach Schlüsseln sortiert
        miniCal.put(LocalDate.now().plusDays(5), "Essen mit Peter");
        miniCal.put(LocalDate.now(), "Projektstart");
        miniCal.put(LocalDate.now().plusDays(2), "Geschäftsreise");
        miniCal.put(LocalDate.now().minusDays(3), "Essen mit Bruce");

        System.out.println(miniCal);

        String termin = miniCal.getOrDefault(LocalDate.of(2024,10,11), "Kein Termin");
        System.out.println(termin);
    }
}
