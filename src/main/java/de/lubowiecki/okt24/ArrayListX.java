package de.lubowiecki.okt24;

import java.util.UUID;

public class ArrayListX {

    public static void main(String[] args) {

        System.out.println(UUID.randomUUID());

        double[] arr = {1,2,3,4,5,6.1};

        int i = 0;
        for (; i < arr.length;) {
            System.out.println(arr[i++]);
        }

        System.out.println();

        // Laufvariable darf nicht vor dem Loop deklariert sein
        for(double d : arr) {
            System.out.println(d);
        }

    }
}
