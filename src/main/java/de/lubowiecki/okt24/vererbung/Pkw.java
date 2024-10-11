package de.lubowiecki.okt24.vererbung;

public class Pkw extends Fahrzeug {

    private int sitzPlaetze;

    public Pkw() {
        // System.out.println("C: Pkw");
    }

    public Pkw(String kennzeich, String marke, String modell, int leistungInPs, int baujahr, int sitzPlaetze) {
        super(kennzeich, marke, modell, leistungInPs, baujahr);
        // System.out.println("C: Pkw");
        this.sitzPlaetze = sitzPlaetze;
    }

    public int getSitzPlaetze() {
        return sitzPlaetze;
    }

    public void setSitzPlaetze(int sitzPlaetze) {
        this.sitzPlaetze = sitzPlaetze;
    }

    @Override
    public void printInfo() {
        System.out.println("Pkw: " + getKennzeich() + ", " + getMarke() + ", Sitze: " + getSitzPlaetze());
    }
}
