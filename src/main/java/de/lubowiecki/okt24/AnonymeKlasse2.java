package de.lubowiecki.okt24;

public class AnonymeKlasse2 {

    public static void main(String[] args) {

        // Anonyme Klassen können aus Klassen (auch abstrakten) und Interfaces gebaut werden

        Spielbar sp1 = new Spielbar() { // Klasse ohne Namen implementiert das Interface
            @Override
            public boolean spielStarten() {
                return false;
            }
        };

        Spielbar sp2 = new Spielbar() { // Klasse ohne Namen implementiert das Interface
            @Override
            public boolean spielStarten() {
                return true;
            }
        };

        System.out.println(sp1.spielStarten());
        System.out.println(sp2.spielStarten());

        // Seit Java 1.8 kann auch ein Lambda geschrieben werden wenn
        // die Basis ein Interface ist und nur eine einzige abstrakte Methode implementiert werden muss

        // boolean spielStarten();
        Spielbar sp3 = () -> true;
        Spielbar sp4 = () -> false;

        checkStart(sp1);
        checkStart(sp2);
        checkStart(sp3);
        checkStart(() -> false);
        checkStart(new MenschAergereDichNicht());

    }

    public static void checkStart(Spielbar sp) {
        System.out.println(sp.spielStarten());
    }

}

interface Spielbar {

    boolean spielStarten();

}

class MenschAergereDichNicht implements Spielbar {

    @Override
    public boolean spielStarten() {
        return true;
    }
}

