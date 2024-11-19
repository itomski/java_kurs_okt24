package de.lubowiecki.okt24.vererbung;

import java.util.ArrayList;
import java.util.List;

public class VererbungTest {

    public static void main(String[] args) {

        // Abstrakte Klassen dürfen nicht direkt instanziert werden
        //Fahrzeug f1 = new Fahrzeug("HH:AB123", "Fiat", "Panda", 95, 2000);
        //System.out.println(f1);

        Pkw pkw = new Pkw("HH:XY345", "Renault", "Zoe", 65, 2020, 5);
        System.out.println(pkw.getBaujahr());
        System.out.println(pkw.getSitzPlaetze());
        System.out.println(pkw.getKennzeich());

        System.out.println();

        Lkw lkw = new Lkw("AB:CZ225", "Scania", "...", 800, 2021, 100);
        System.out.println(lkw.getLadeVolumen());
        System.out.println(lkw.getBaujahr());
        System.out.println(lkw.getMarke());
        System.out.println(lkw.getKennzeich());

        System.out.println();

        List<Fahrzeug> fahrzeuge = new ArrayList<>();
        fahrzeuge.add(pkw);
        fahrzeuge.add(lkw);
        fahrzeuge.add(new Lkw("AB:AB228", "Mercedes", "Actros", 1200, 1999, 150));
        fahrzeuge.add(new Pkw("HH:OP152", "Renault", "Zoe", 65, 2022, 5));
        fahrzeuge.add(new Pkw("HH:DS445", "Ford", "Mondeo", 120, 1995, 5));

        for(Fahrzeug f : fahrzeuge) {
            f.printInfo(); // Instanzmethoden werden auf dem Objekttyp ausgeführt
        }
    }
}
