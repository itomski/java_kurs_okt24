package de.lubowiecki.okt24;

public class FinalTest {

    // Instanzkonstante: Muss spätestens im Konstruktor zugewiesen werden
    private final int zahl = 100;

    // Klassenkostante: Wird beim laden der Klasse zugewiesen
    private static final int andereZahl = 200;

    public static void main(String[] args) {

        // lokale Kostante: Compiletime Konstante
        final int x = 300;

        // lokale Kostante: Runtime Konstante
        final int y;
        y = 300;

        System.out.println(x);
        System.out.println(y);

        // Compiletime Konstante
        final boolean ok1 = true;

        // Runtime Konstante
        final boolean ok2;
        ok2 = true;

        while(ok2) {
            System.out.println("hi");
        }

        System.out.println("Ende");

        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}
