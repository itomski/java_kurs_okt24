package de.lubowiecki.okt24;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {

        //long start = System.currentTimeMillis();
        Instant iStart = Instant.now();


        Date datum1 = new Date();
        System.out.println(datum1);
        System.out.println(datum1.getMonth());
        datum1.setMonth(10);
        System.out.println(datum1);

        datum1 = new Date(2020, 10, 15, 15, 10, 1);
        System.out.println(datum1);

        System.out.println();

        //LocalDate ld = new LocalDate();
        LocalDate ld = LocalDate.now(); // new ist eine Factory
        ld = LocalDate.of(2020, 12, 7); // of ist eine Factory
        System.out.println(ld);
        //ld = ld.plusDays(10);
        ld = ld.plus(10, ChronoUnit.DAYS);
        System.out.println(ld);
        ld = ld.plusMonths(2);
        System.out.println(ld);
        ld = ld.plusYears(10);
        System.out.println(ld);

        System.out.println(ld.getMonthValue()); // int
        System.out.println(ld.getMonth()); // Month ENUM
        System.out.println(ld.get(ChronoField.YEAR));

        LocalTime lt = LocalTime.now();
        lt = LocalTime.of(17, 22, 33);
        //td = td.plusDays(10);
        //lt = lt.plus(10, ChronoUnit.DAYS); // Runtime-Exception
        lt = lt.plus(10, ChronoUnit.MINUTES); // OK
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        ldt = LocalDateTime.of(2022, 5, 17, 12, 22);
        ldt = LocalDateTime.of(ld, lt);
        System.out.println(ldt);

        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ld.format(DATE_FMT));

        System.out.println();

        LocalDate heute = LocalDate.now();
        LocalDate kursEnde = LocalDate.of(2024, 11, 22);
        Period p = Period.between(heute, kursEnde);
        System.out.println(p);

        System.out.println();

        //long end = System.currentTimeMillis();
        //System.out.println(end - start + "ms");

        Instant iEnd = Instant.now();

        Duration abstand = Duration.between(iStart, iEnd);
        System.out.println(abstand.toNanos() + "ns");

    }
}
