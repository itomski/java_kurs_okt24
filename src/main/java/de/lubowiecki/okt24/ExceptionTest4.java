package de.lubowiecki.okt24;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest4 {

    public static void main(String[] args) {

        try {
        }
        catch(ArrayIndexOutOfBoundsException e) { // Runtime-Exception
        }

        // Checked-Exceptions können nur gefangen werden, wenn die Möglichkeit besteht,
        // dass sie auftauchen
//        try {
//        }
//        catch(IOException e) { // Error
//        }

        // Exception ist checked, kann aber trotzdem überall gefangen werden
        try {
        }
        catch(Exception e) {
        }

        // int i, j; // OK
        //int i, int j; // Error

        for(int i = 10, j = 20; j < 200; System.out.println(j), i++) {
        }

        StringBuilder sb = new StringBuilder();
        // sb.equals(...); // Verwendet die equals-Methode von Object


    }

    static IOException method() {
        try {
            return new IOException();
        }
        catch(RuntimeException e) {
            return new FileNotFoundException();
        }
    }
}
