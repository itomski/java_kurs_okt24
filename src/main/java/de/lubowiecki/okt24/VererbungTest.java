package de.lubowiecki.okt24;

public class VererbungTest {

    public static void main(String[] args) {

        Object o = new Object();
        System.out.println(o.hashCode());
        System.out.println(o);

        // Instanzmethoden werden immer auf dem Objekttyp ausgeführt
        // Statische Methoden und Eigenschaften werden auf dem Referenztyp ausgeführt

        // Referenztyp: Object
        // Objekttyp: String
        o = "Hallo Welt"; // String IS-A Object
        System.out.println(o.hashCode());
        System.out.println(o);
        // o.toLowerCase(); // String-Methode ist über die Object Referenz nicht sichtbar

        o = 123; // Integer IS-A Object
        System.out.println(o.hashCode());
        System.out.println(o);

    }
}
