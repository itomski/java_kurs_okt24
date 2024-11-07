package de.lubowiecki.okt24;

import java.io.IOException;
import java.util.Arrays;

public class ArrayTest6 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));

        args = null;

        System.out.println(Arrays.toString(args));

        for(int i : new int[]{10,20,30,40,50}) {
            System.out.println(i);
        }


        try {
            doSomething3();
        }
        catch(IOException e) {
            // Checked Exceptions können nur gefangen werden, wenn die Mthode sie auch werfen kann
            e.printStackTrace();
        }

        try {
            doSomething1();
        }
        catch(Exception e) {
            // Ausnahme ist Exception - Kann immer gefangen werden
            e.printStackTrace();
        }

        try {
            doSomething1();
        }
        catch(RuntimeException e) { // RuntimeExceptions können immer gefangen werden
            e.printStackTrace();
        }

        // bei Arrays von primitiven Typen wird das Array mit dem Standardwert befüllt
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));
        Integer[] arr2 = new Integer[10];
        System.out.println(Arrays.toString(arr2));

        double[] arr3 = new double[10];
        System.out.println(Arrays.toString(arr3));
        System.out.println((arr3[2] + arr3[3]) / arr3[4]); // NaN

        Double d = 0.0 / arr3[4]; // NaN
        System.out.println(d.isInfinite());
        d = 3.0 / arr3[4]; // Infinite
        System.out.println(d.isInfinite());

        if(d.isInfinite() || d.isNaN()) {
            System.out.println("Ungültige Zahl");
        }

    }

    public static void doSomething1() {

    }

    public static void doSomething2() throws RuntimeException {

    }

    public static void doSomething3() throws IOException {

    }

}
