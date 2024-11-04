package de.lubowiecki.okt24.fahrzeuge;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Repository<Fahrzeug> repo1 = new FahrzeugDbRepository();
        Repository<Benutzer> repo2 = new BenutzerRepository();

    }
}
