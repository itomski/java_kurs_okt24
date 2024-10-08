package de.lubowiecki.okt24;

public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); // capacity: 16, length: 0
        System.out.println("C: " + sb.capacity());
        System.out.println("L: " + sb.length());
        sb.append(12345678);
        sb.append(12345678);
        sb.append(1);
        // Vergrößerung = Alte Capacity * 2 + 2
        System.out.println("C: " + sb.capacity());
        System.out.println("L: " + sb.length());
        System.out.println("trimToSize");
        sb.trimToSize(); // Capacity wird auf Length angepasst
        System.out.println("C: " + sb.capacity());
        System.out.println("L: " + sb.length());

        sb.setLength(10); // Schneidet die Zeichenkette nach 10 Zeichen ab
        System.out.println("C: " + sb.capacity());
        System.out.println("L: " + sb.length());
        System.out.println();

        sb = new StringBuilder(100); // capacity: 100, length: 0
        System.out.println("C: " + sb.capacity());
        System.out.println("L: " + sb.length());

        System.out.println();

        sb = new StringBuilder("Hallo"); // capacity: length + 16, length: 5
        System.out.println("C: " + sb.capacity());
        System.out.println("L: " + sb.length());
    }
}
