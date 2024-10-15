package de.lubowiecki.okt24;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExceptionAufgabe {

    // Schreibe ein Programm, das Eingaben für Tag, Monat und Jahr entgegennimmt und dann ein LocalDate
    // daraus produziert und anzeigt.
    // Wenn die Angabe nicht ok ist, soll noch ein weiteres mal gefragt werden
    // Nutze dafür Exceptions

    public static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //inputDate();

        while(true) {
            try {
                System.out.print("Eingabe: ");
                String input = scanner.nextLine();
                LocalDate date = LocalDate.parse(input, DATE_FMT);
                System.out.println(date);
                break;
            }
            catch (DateTimeException e) {
                System.out.println("Fehler!");
            }
        }
    }

    public static void inputDate() {
        try {
            System.out.print("Eingabe: ");
            String input = scanner.nextLine();
            LocalDate date = LocalDate.parse(input, DATE_FMT);
            System.out.println(date);
        }
        catch(DateTimeException e) {
            System.out.println("Fehler!");
            inputDate();
        }
    }
}
