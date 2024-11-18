package de.lubowiecki.okt24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SearchTest {

    public static void main(String[] args) {

        List<String> namen = Arrays.asList("Peter", "Carol", "Steve", "Tony", "Natasha", "Scott"); // FixedSizeList

        // Seit Java 10
        namen = List.of("Peter", "Carol", "Steve", "Tony", "Natasha", "Scott"); // FixedSizeList

        // Veränderbare Liste
        namen = new ArrayList<>(List.of("Peter", "Carol", "Steve", "Tony", "Natasha", "Scott"));

        System.out.println(find(namen, "Tony"));
        System.out.println(find(namen, "tony"));

        int pos = find(namen, "Tony");
        if(pos >= 0) System.out.println(pos);

        System.out.println();

        System.out.println(findNext(namen, "Tony"));
        System.out.println(findNext(namen, "tony"));

        findNext(namen, "tony").ifPresent(System.out::println);

        System.out.println();

        LocalDate ld = LocalDate.now();
        System.out.println(ld.getMonthValue());
        System.out.println(ld.getMonth());


    }

    static int find(List<String> list, String needle) {

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(needle))
                return i;
        }

        return -1;
    }

    // Für primitive Datentypen
    // OptionalInt
    // OptionalLong
    // OptionalDouble

    // für komplexe Datentypen
    // Optional<T>

    static OptionalInt findNext(List<String> list, String needle) {

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(needle))
                return OptionalInt.of(i);
        }

        return OptionalInt.empty();
    }
}
