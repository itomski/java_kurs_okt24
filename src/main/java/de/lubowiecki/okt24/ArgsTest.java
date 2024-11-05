package de.lubowiecki.okt24;

import java.util.Arrays;

public class ArgsTest {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));

        if(args.length == 0) {
            System.out.println("Es wurde nichts übergeben...");
        }
        else {
            for(String s : args) {
                System.out.println(s);
            }
        }

        byte b = 10;
        //b = 128;
        //showByte(10);

    }

    static void showByte(byte b) {
        System.out.println(b);
    }
}
