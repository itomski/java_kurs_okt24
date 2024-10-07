package de.lubowiecki.okt24;

public class DefaultValueTest {

    // Instanz und Klassenvariablen bekommen Standardwerte
    static int j;

    // Bei komplexen Datentypen ist der Standardwert null
    static String s;

    public static void main(String[] args) {

        // Lokale Variablen bekommen KEINE Defaultwerte
        int i;
        i = 0;
        System.out.println(i);

        System.out.println(j);

        System.out.println(s);

        //System.out.println(s.toLowerCase()); // NullPointerException

        char c = 'C';
        int k = c;
        System.out.println(k);
    }
}
