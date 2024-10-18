package de.lubowiecki.okt24;

public class InstanzeTest {

    public static void main(String[] args) {

        Machbar2 m2;

        // m2 = new Machbar2(); // Interface kann nicht instanziert werden

        // Eine Anonyme Klasse wird bereitgestellt.
        // Sie implementiert das Interface und wird sofort 1x instanziert
        m2 = new Machbar2() {

            @Override
            public void machDies() {
                System.out.println(100);
            }

            @Override
            public void machDas() {
                System.out.println(200);
            }
        };

        Machbar2 m3 = new Machbar2() {

            @Override
            public void machDas() {
                System.out.println("67890");
            }
        };

        m2.machDas();
        m2.machDies();

        System.out.println();

        m3.machDas();
        m3.machDies();

    }
}

interface Machbar2 {

    default void machDies() {
        System.out.println(0);
    }

    void machDas();

    /*
    // default Methoden dürfen die Methoden von Object NICHT überschreiben
    public default String toString() { // Compilererror
        return "";
    }
    */
}
