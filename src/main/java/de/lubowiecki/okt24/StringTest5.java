package de.lubowiecki.okt24;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StringTest5 {

    public static void main(String[] args) {

        String str = "1234567890";
        char[] chars = new char[10];

        str.getChars(0,8, chars, 0);

        for(char c : chars) {
            System.out.println(c);
        }

        System.out.println();

        str = "1234567890";
        String[] parts = str.split("");
        System.out.println(Arrays.toString(parts));
        System.out.println(String.join("#", parts));

        String erg = str.join("-", parts);
        System.out.println(erg);

        System.out.println();

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // ld = ld.plus(100, ChronoUnit.HOURS);
        LocalTime lt = LocalTime.of(12,22);
        LocalDateTime ldt = ld.atTime(lt);
        System.out.println(ldt);

        System.out.println();

        ldt = lt.atDate(ld);
        System.out.println(ldt);

        System.out.println();

        int i = 10;

        Consumer<String> cons = v -> System.out.println(v + i);

        List<String> namen = List.of("Peter", "Bruce", "Carol", "Natasha");
        namen.forEach(cons);

    }
}
