package de.lubowiecki.okt24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class Test2a {

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[3][3];
        /*
        0: 0,0,0
        1: 0,0,0
        2: 0,0,0
        */
        arr[0] = new int[2];
        /*
        0: 0,0
        1: 0,0,0
        2: 0,0,0
        */

        printArray(new int[]{1,2,3,4,5});

        int[] arr2 = new int[]{1,2,3,4,5};
        printArray(arr2);

//        System.out.println(1++);
//        System.out.println(++1);
//        System.out.println(arr2[1++]);

        int a = 1;
        // Geht nur mit Variablen!!!!!!
        a++; // a = a + 1;
        a += 10; // a = a + 10;

        // Aufgabe 5
        int[][] arr3 = new int[3][2];
        /*
        0: 0,0
        1: 0,0
        2: 0,0
        */
        arr3[0] = new int[3];
        /*
        0: 0,0,0
        1: 0,0
        2: 1,2,3
        */

        int[] arr4 = {1,2,3}; // Nur bei gleichzeitiger Deklaration erlaubt
        //arr4 = {4,5,6}; // Error

        // Ist Variable schon deklariert muss man das Array mit new erzeugen
        arr4 = new int[]{1,2,3};


         // Aufagebe 6
        int[][] arr5 = new int[2][]; // {0: null, 1: null}
        // Arrays.sort(arr5[1]); // Runtime-Exception: NullPointer


        int[] arr6 = {5,7,1,8,-2};
        Arrays.sort(arr6); // {-2,1,5,7,8}
        System.out.println(Arrays.binarySearch(arr6, -2));

        // Position wo der Wert stehen müsste negiert + -1
        System.out.println(Arrays.binarySearch(arr6, 6));

        System.out.println(finalTest());


        // try-with-resources ist das einzige try das ohne catch/finally genutzt werden kann
        try(Writer out = new FileWriter("xyz.txt")) {
            // out.close(); // wird automatsich aufgerufen
        }

        Helper.doSomething(10);

    }

    private static void printArray(int[] /* bla bla */ arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static int finalTest() {

        try {
            System.out.println("A");
            return 10;
        }
        finally {
            System.out.println("B");
            return 20;
        }
    }

}
