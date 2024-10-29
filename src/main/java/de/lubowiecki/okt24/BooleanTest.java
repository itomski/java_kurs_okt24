package de.lubowiecki.okt24;

public class BooleanTest {

    public static void main(String[] args) {

        int i = 10;
        boolean b = true;

        if((i = 10) > 5) {
            System.out.println("...");
        }

        if(b = false) {
            System.out.println("...");
        }

        /*
        if(false = b) {
            System.out.println("...");
        }
        */

    }

}
