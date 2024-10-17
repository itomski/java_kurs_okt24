package de.lubowiecki.okt24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KopplungTest {

    public static void main(String[] args) {

        Camp camp = new Camp();
        camp.addBesucher(new Scout("Peter", "Parker"));
        camp.addBesucher(new Scout("Bruce", "Banner"), new Scout("Carol", "Danvers"));
        camp.addBesucher(new Scout("Natasha", "Romanov"));
        camp.addBesucher(Chef.getInstance());
        camp.addBesucher(new Betreuer("Max", "Mustermann"));

        //camp.showBesucher();

        camp.showVornamenListe();

    }
}

class Camp {

    private List<Besucher> besucher = new ArrayList<>();

    public void addBesucher(Besucher besucher) {
        this.besucher.add(besucher);
    }

    public void addBesucher(Besucher... besucher) {
        this.besucher.addAll(Arrays.asList(besucher));
    }

    public void showBesucher() {
        besucher.forEach(b -> System.out.println(b)); // Consumer
    }

    public void showVornamenListe() {
        besucher.forEach(b -> System.out.println(b.getVorname())); // Consumer
    }
}

// Immutable
class Scout implements Besucher {

    private final String vorname;

    private final String nachname;

    public Scout(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    @Override
    public String getTyp() {
        return "SCOUT";
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(getTyp()).append(':')
                .append(vorname).append(' ').append(nachname).toString();
    }
}

interface Besucher {

    String getVorname();
    String getNachname();
    String getTyp();
    String toString();

}

class Betreuer implements Besucher {

    private String vorname;
    private String nachname;

    public Betreuer(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String getTyp() {
        return "BETREUER";
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(getTyp()).append(':')
                .append(getVorname()).append(' ').append(getNachname()).toString();

    }
}


// Singleton
class Chef implements Besucher {

    private static Chef instance = new Chef();

    private Chef() {
    }

    public static Chef getInstance() {
        return instance;
    }

    @Override
    public String getVorname() {
        return "Tony";
    }

    @Override
    public String getNachname() {
        return "Stark";
    }

    @Override
    public String getTyp() {
        return "CHEF";
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(getTyp()).append(':')
                .append(getVorname()).append(' ').append(getNachname()).toString();

    }
}