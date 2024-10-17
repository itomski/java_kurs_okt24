package de.lubowiecki.okt24;

public class InterfaceTest2 {

    public static void main(String[] args) {

        System.out.println(Fahrbar.SPEED);
        Fahrbar.showSpeed();
        //Fahrbar.showPower(); // Error: default Methoden sind Instanzmethoden = werden auf einem Objekt ausgeführt

        System.out.println(Jeep.SPEED); // Eigenschaften vom Interface werden vererbt
        // Jeep.showSpeed(); // Error: statische Methoden vom Interface werden NICHT vererbt

        System.out.println();

        // Instanzmethoden werden IMMER auf dem Objekttyp ausgeführt
        // Es sind nur die Methoden sichtbar, die der Referenztyp deklariert

        // Referenztyp(links): Jeep
        // Objekttyp(rechts): Jeep
        Jeep j1 = new Jeep();
        j1.showPower(); // OK
        j1.showBrand();
        System.out.println(j1.is4x4());

        System.out.println();

        // Referenztyp(links): Fahrbar
        // Objekttyp(rechts): Jeep
        Fahrbar f1 = new Jeep();
        f1.showPower(); // OK
        f1.showBrand(); // OK
        //System.out.println(f1.is4x4()); // Error: Im Referenztyp ist die Methode nicht enthalten = nicht sichtbar!
        System.out.println(((Jeep)f1).is4x4()); // OK: Referenz wird auf Jeep gecastet
    }
}

interface Fahrbar {

    // public static final
    int SPEED = 100;

    static void showSpeed() {
        System.out.println(SPEED);
    }

    // Instanzmethode - abstrakt = MUSS eigebaut werden
    void showBrand();

    // Instanzmethode - default - KANN eigebaut werden
    default void showPower() {
        System.out.println(0);
    }
}

interface MonsterTruck {

    default void showPower() {
        System.out.println(2000);
    }
}

// Erbt eine Klasse zwei gleich default Methoden von unterschiedlichen Interfaces,
// muss die Klasse selbst eine solche Methode implementieren, da sonst nicht klar ist,
// welche der Methoden benutzt werden soll
class Jeep implements Fahrbar, MonsterTruck {

    private boolean _4x4 = true;

    @Override
    public void showBrand() {
        System.out.println("JEEP");
    }

    @Override
    public void showPower() {
        MonsterTruck.super.showPower(); // Verwendet die Methode aus MonsterTruck
    }

    public boolean is4x4() {
        return _4x4;
    }
}
