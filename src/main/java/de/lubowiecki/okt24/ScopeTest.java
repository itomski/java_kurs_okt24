package de.lubowiecki.okt24;

public class ScopeTest {

    // Klassenvariable
    private static int zahl; // Ab dem laden der Klasse bis Ende des Programms

    // Instanzvariable
    private int andereZahl; // Ab erzeugung des Objektes, bis das Objekt entfernt wird

    public static void main(String[] args) {

    }

    private void machWas(byte ganzAndereZahl) {
        // Lokale Variblen
        // Variablen sind nur auf die Ausführung des Blocks eingeschränkt
        // Methoden-Argumente haben gleichen Scope wie lokale Variablen
        var zahl = 100;
        double andereZahl = 100; // primitive widening
        Object o = new Object();

        {
            // Block-Variablen sind nur auf die Ausführung des Blocks eingeschränkt
            var nochEineZahl = 500;
        }
    }
}
