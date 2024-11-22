package de.lubowiecki.okt24;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CastTest2 {

    public static void main(String[] args) {

        int i = 10;
        byte b = 20;
        i = b; // widening
        b = (byte)i; // narrowing. Cast notwendig

        String s = "Moin Moin";
        Object o = s; // Upcasting. Cast erfolgt automatisch (wenn s Kindklasse von o ist)
        s = (String)o; // Downcasting. Cast notwendig. ClassCastException wenn hier o kein String liegt
        //Integer ii = (Integer)o; // ClassCastException!
        // Number n = s; // Compilererror!

        List<String> l = new ArrayList<>();

        Collection<String> c = new ArrayList<>();

        System.out.println(getNumber());

//        try {
//            throw new IllegalArgumentException();
//        }
//        finally {
//            throw new RuntimeException();
//        }

        try {
            // FileOutputStream out = new FileOutputStream("data.txt")
            System.out.println("...");
            // out.close();
        }
        catch(RuntimeException e) {
            System.out.println("Problem");
        }

        try(/* Resourcen werden geöffnet */ MyResource r = new MyResource()) {
            r.write();
            /* Resourcen werden automatisch geschlossen */
            // out.close();
        }
        catch(Exception e) {
            //e.printStackTrace();
            System.out.println(((Exception)e.getSuppressed()[0]).getMessage());
        }
    }

    public static int getNumber() {
        try {
            return 10;
        }
        finally {
            return 20;
        }
    }
}

class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new IllegalStateException("Bla bla bla");
    }

    public void write() {
        throw new NullPointerException("Keine echte Resource");
    }
}
