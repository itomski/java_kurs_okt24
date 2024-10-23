package de.lubowiecki.okt24;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.function.Predicate;

public class DateTimeFormatTest {

    public static void main(String[] args) {


        //LocalDate ld = LocalDate.parse("25.10.2022"); // DateTimeParseException
        final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // y/u e d D m M, H, s
        LocalDate ld = LocalDate.parse("25.10.2022", FMT); // OK
        System.out.println(ld);

        System.out.println(ld.format(FMT));

        System.out.println();

        //Locale.setDefault(Locale.CANADA);

        final DateTimeFormatter LOCALIZED_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ld.format(LOCALIZED_FMT));

        LocalDate ausProdukt = LocalDate.now().minusDays(15);
        LocalDate heute = LocalDate.now();

        long days = Duration.between(ausProdukt.atStartOfDay(), heute.atStartOfDay()).toDays();
        System.out.println(days);

        System.out.println();

        days = ausProdukt.until(heute, ChronoUnit.DAYS);
        System.out.println(days);

        Predicate<String> pred1 = s -> s != null;
        Predicate<String> pred2 = s -> s.length() > 5;

        pred2 = pred1.and(pred2); // Verbindet 2 Predicates
        pred2 = pred2.negate();


    }
}
