package de.lubowiecki.okt24;

//import static java.lang.System.out; // importiert das out
import static java.lang.System.*; // importiert alle statischen Eigenschaften und Methoden aus System
import static de.lubowiecki.okt24.Wochentag.*;
import static java.lang.Math.*;

public class StaticImportTest {

    public static void main(String[] args) {

        // Mit statischen Imports kann man statisches Inventar (Eigenschaften oder Methoden)
        // einer anderen Klasse verwenden

        out.println();
        // err.println("Das ist das Haus von Nikigraus");

        out.println(getProperty("user.home"));

        Wochentag tag = DO;
        tag = MI;

        out.println(PI);
        out.println(pow(5,5));

    }
}
