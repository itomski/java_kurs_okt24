package de.lubowiecki.okt24;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.RandomAccess;

public class OverrideTest {

    public static void main(String[] args) {

        AClass ac = new BClass();

        // Referenztyp (AClass) zeigt, was sichtbar ist
        // Objekttyp (BClass) ist für die Ausführung verantwortlich
        int i = ac.doSomething();

        //int _ = 10;
        var j = 100;
        var k = 10.0;

    }
}

class AClass {

    int doSomething() {
        System.out.println("A");
        return 10;
    }

}

class BClass extends AClass {

    public int doSomething() throws RuntimeException {
        System.out.println("B");
        return 20;
    }
}