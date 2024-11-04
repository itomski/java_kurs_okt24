package de.lubowiecki.okt24;

public class SignatureTest {

    public static void main(String[] args) {

        machWas(10, null);

        int l = "Hallo Welt".length();

    }

    public static void machWas(int i, Object o) {

    }

//    static int machWas(int i, Object o) {
//        return 10;
//    }

    static void machWas(Object o, int i) {

    }

    // Innere Klasse
    class Sub {

    }
}
