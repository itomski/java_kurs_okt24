package de.lubowiecki.okt24;

import java.io.FileWriter;
import java.io.IOException;

public class MainTest3 {

    public static void main(String[] args) {
        System.out.println("Hi");
        // machWas();
        machWasNext2();

        // Float f = 100; //Error: Autoboxing von int zu Integer
        Float f1 = 100F; //Autoboxing von float zu Float
        // Float f2 = 100.5; //Autoboxing von double zu Double

    }

    // throws für CheckedExceptions kann immer an die Signatur geschrieben werden
    private static void machWas() throws IOException {
        System.out.println("MachWas");
    }

    private static void machWasNext2() throws RuntimeException {
        System.out.println("MachWasNext2");
    }

    private static void machWasNext() {

        try {
            FileWriter writer = new FileWriter("data.txt");
            System.out.println("read file...");
        }
        catch (IOException e) { // Checked-Exceptions können nur gefangen werden, wenn sie auch wirklich auftauchen können
            System.out.println("Problem");
        }

        try {
            //FileWriter writer = new FileWriter("data.txt");
            System.out.println("read file...");
        }
        catch (Exception e) { // Exception (ist checked) kann aber IMMER gefangen werden
            System.out.println("Problem");
        }

        try {
//            int[] arr = new int[10];
//            arr[11] = 100;
            System.out.println("read array...");
        }
        catch (ArrayIndexOutOfBoundsException e) { // ALLE Runtime-Exceptions können IMMER gefangen werden!
            System.out.println("Problem");
        }
    }


}
