package de.lubowiecki.okt24;

import java.util.Locale;

public class BitOperatorenTest {

    public static void main(String[] args) {

        int i = 15;
        int j = 7;


        // 15: 00001111
        //  7: 00000111
        //  &: 00000111
        //  |: 00001111
        //  ^: 00001000

        System.out.println(i & j); // AND
        System.out.println(i | j); // OR
        System.out.println(i ^ j); // XOR

        // 15: 00001111
        //  3: 00000011
        System.out.println(i >> 2); // shift

        // 15: 00001111
        // 15: 00111100
        System.out.println(i << 2); // shift


        String name = null;
        if(name != null && name.length() > 0) { // rechts wird nur ausgewertet, wenn links true ergibt
            System.out.println(name.toLowerCase());
        }

        if(name != null & name.length() > 0) { // beide seiten werden ausgewertet
            System.out.println(name.toLowerCase());
        }



    }
}
