package de.lubowiecki.okt24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        System.out.println(checkFinally());


        try {
            check(-20);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        System.out.println();

        System.out.println("START: Main");
        try {
            machWasA();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("ENDE: Main");
    }

    public static void machWasA() throws IOException {
        System.out.println("START: A");
        machWasB();
        System.out.println("ENDE: A");
    }

    public static void machWasB() throws IOException {
        System.out.println("START: B");
        machWasC();
        System.out.println("ENDE: B");
    }

    public static void machWasC() throws IOException {
        System.out.println("START: C");
        List<String> lines = Files.readAllLines(Paths.get("text_.txt"));
        System.out.println("ENDE: C");
    }

    // Exception ist checked
    public static void check(int age) throws Exception {
        if(age > 0 && age < 18) {
            System.out.println("Nö!");
        }
        else if(age >= 18){
            System.out.println("Ok!");
        }
        else {
            //throw new IllegalArgumentException("Angabe ist ungültig.");
            throw new Exception("Angabe ist ungültig.");
        }
    }

    public static int checkFinally() {
        try {
            return 10;
        }
        finally {
            System.out.println("FINALLY");
            return 20;
        }
    }

}
