package de.lubowiecki.okt24;

public class DatatypeTest {

    static String a; // null

    public static void main(String[] args) {

        // byte < short < int < long < float < double
        //         char < int

        int i = 'A';
        System.out.println(i);

        byte b = 10;
        b += 10; // b = (byte)(b + 10);
        b++; // b = (byte)(b + 1)
        // b = b + b;

        int j;

        final boolean ok = true;

        if(ok) { // if(true) {
            j = 10;
        }

        System.out.println(j);

        double d = 1f;
    }

}
