package de.lubowiecki.okt24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionTest {

    public static void main(String[] args) {

        // Unchecked
        int[] arr = new int[10];
        // arr[10] = 100; // ArrayIndexOutOfBoundsException

        String str = null;
        // System.out.println(str.toLowerCase()); // NullPointerException


        // Checked: behandeln oder delarieren
        try {
            Connection connection = DriverManager.getConnection("...");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("START: Main");
        //try {
            machWasA();
        //}
        //catch(RuntimeException e) {
        //    System.out.println(e.getMessage());
        //}
        System.out.println("ENDE: Main");
    }

    public static void machWasA() {
        System.out.println("START: A");
        try {
            machWasB();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("ENDE: A");
    }

    public static void machWasB() {
        System.out.println("START: B");
        machWasC();
        System.out.println("ENDE: B");
    }

    public static void machWasC() {
        System.out.println("START: C");
        String str = null;
        System.out.println(str.toLowerCase()); // NullPointerException
        System.out.println("ENDE: C");
    }
}
