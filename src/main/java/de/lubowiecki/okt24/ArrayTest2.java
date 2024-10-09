package de.lubowiecki.okt24;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest2 {

    public static void main(String[] args) {

        int[] zahlen = new int[10];
        zahlen[0] = 10;
        zahlen[1] = 15;
        //zahlen[2] = 22.0;
        System.out.println(Arrays.toString(zahlen));

        double[] zahlen2 = new double[10];
        zahlen2[0] = 10; // primitive widening
        zahlen2[1] = 15;
        zahlen2[2] = 22.0;

        System.out.println(Arrays.toString(zahlen2));

        // Integer IS-A Number
        // Double IS-A Number
        Number[] zahlen3 = new Number[10];
        zahlen3[0] = 10; // Autoboxing, komplex widening
        zahlen3[1] = 15;
        zahlen3[2] = 22.0; // Autoboxing, komplex widening
        zahlen3[3] = 0x14; // Autoboxing, komplex widening
        zahlen3[4] = 0b110011; // Autoboxing, komplex widening
        //zahlen3[4] = "0x14"; // Error: String IS-NOT-A Number

        System.out.println(Arrays.toString(zahlen3));

        String str = "0x14";
        System.out.println(Integer.decode(str)); // Wenn Zahl als String vorliegt

        System.out.println();

        Object[] arr = new Object[5];
        arr[0] = 1; // Autoboxing von int zu Integer, komplex Widening von Integer auf Object
        arr[1] = 1.0; // Autoboxing von double zu Double, komplex Widening von Double auf Object
        arr[2] = "Hallo"; // komplex Widening von String auf Object
        arr[3] = new ArrayList<>(); // komplex Widening von ArrayList auf Object

        for(Object o : arr) {
            if(o instanceof Integer) System.out.println(((Integer)o).longValue());
            if(o instanceof Double) System.out.println(((Double)o).byteValue());
        }

        // Objektbeziehungen
        // IS-A: Vererbung
        // HAS-A: wird über Eigenschaften gelöst

        arr = new Object[100];

        int[] werte1;
        int werte2[];

        int[] a,b,c; // a, b, c sind int Arrays
        int d,e[],f; // d, f sind ints, e ist ein int Arrays

        int[] werte3[]; // 2d Array

        double[] zahlen4 = {10.0, 2.5, 7.8}; // nur bei gleichzeitiger Deklaration der Variable möglich
        //zahlen4 = {10.0, 2.5, 7.8}; // Error
        zahlen4 = new double[]{1.0, 2.0, 3.0}; // Ok
        //zahlen4 = new double[100]{5,7,19,88,7}; // Error
        zahlen4 = new double[100]; // Ok: freie Plätze werden mit Standardwert aufgefüllt

        String[] namen = {"Peter", "Bruce", "Carol", "Natasha", "Scott"};
        // System.out.println(namen[-1]); // ArrayIndexOutOfBoundsException
        // System.out.println(namen[10]); // ArrayIndexOutOfBoundsException
        // namen = new String[-10]; // NegativeArraySizeException

        namen = new String[10];
        // namen[0] = 123; // 123 ist kein String
        Object[] objArr = namen;
        // objArr[0] = 123; // ArrayStoreException, das Array auf dem Heap ist ein String-Array


    }
}
