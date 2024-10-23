package de.lubowiecki.okt24;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocalizationTest2 {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Locale.setDefault(Locale.CHINESE);
        new LocalizationTest2().start();
    }

    private void start() {

        // TODO: Aufgabe: Baue in die Produktverwaltung eine Mehrsprachigkeit ein

        ResourceBundle bundle = ResourceBundle.getBundle("de.lubowiecki.lang.ui");

        System.out.println(bundle.getString("hi"));
        System.out.println(bundle.getString("question.name"));
        System.out.print(bundle.getString("input") + " ");
        String name = scanner.nextLine();
        System.out.println(bundle.getString("welcome") + " " + name);
    }
}
