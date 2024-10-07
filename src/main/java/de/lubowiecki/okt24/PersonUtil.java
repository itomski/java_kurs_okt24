package de.lubowiecki.okt24;

public class PersonUtil {

    // Klasse kann nicht instanziert werden und kann auch nicht beerbt werden
    private PersonUtil() {
    }

    public static void print(Person p) {
        System.out.println("Hi. Mein Name ist " + p.getVorname() + " " + p.getNachname());
    }
}
