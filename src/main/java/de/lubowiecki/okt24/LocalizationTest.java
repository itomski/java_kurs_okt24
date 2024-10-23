package de.lubowiecki.okt24;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalizationTest {

    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        LocalDate heute = LocalDate.now();

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(heute.format(fmt));
        System.out.println(numberFormat.format(10532.123));
        System.out.println(Locale.getDefault());

        try {
            Number n = numberFormat.parse("15,7");
            System.out.println(n.doubleValue());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        Locale.setDefault(Locale.UK);
        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(heute.format(fmt));
        numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(10532.123));
        System.out.println(Locale.getDefault());

        System.out.println();
        Locale.setDefault(Locale.US);
        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(heute.format(fmt));
        numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(10532.123));
        System.out.println(Locale.getDefault());

        System.out.println();
        Locale.setDefault(Locale.CHINA);
        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(heute.format(fmt));
        numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(10532.123));
        System.out.println(Locale.getDefault());

        System.out.println();
        Locale.setDefault(Locale.FRANCE);
        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(heute.format(fmt));
        numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(10532.123));
        System.out.println(Locale.getDefault());

    }
}
