package de.lubowiecki.okt24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatTest {

    public static void main(String[] args) {


        //LocalDate ld = LocalDate.parse("25.10.2022"); // DateTimeParseException
        final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // y/u e d D m M, H, s
        LocalDate ld = LocalDate.parse("25.10.2022", FMT); // OK
        System.out.println(ld);

        System.out.println(ld.format(FMT));

    }
}
