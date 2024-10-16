package de.lubowiecki.okt24;

import java.util.Arrays;

public class ArrayTest3 {

    public static void main(String[] args) {

        int[][] arr = new int[2][]; // {null, null}
        System.out.println(Arrays.toString(arr));

        int[][] arr2 = new int[2][]; // {null, null}
        arr2[0] = new int[3]; // {{0,0,0}, null}
        arr2[1] = new int[2]; // {{0,0,0}, {0,0}}

        int[] arr3 = {1,5,7};
        //arr3 = {6,8,9}; // Nicht erlaubt!
        //arr3 = new int[]{6,8,9}; // OK
        arr3 = new int[6]; // {0,0,0,0,0,0}

    }
}
