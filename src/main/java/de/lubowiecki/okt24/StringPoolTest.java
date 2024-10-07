package de.lubowiecki.okt24;

public class StringPoolTest {

    private static final String KEYS = ".....";

    public static void main(String[] args) {

        String s1 = "Moin"; // Landet im Pool
        String s2 = "Moin";
        String s3 = new String("Moin"); // Landet nicht im Pool

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println();

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        String s5 = "Mein Name ist ";
        System.out.println(s5 + "Peter");

        final String s6 = "Mein Name ist "; // Compiletime-Konstante
        System.out.println(s6 + "Peter");

        final String s7; // Runtime-Konstante
        s7 = "Mein Name ist ";
        System.out.println(s7 + "Peter");
    }
}
