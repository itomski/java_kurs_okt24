package de.lubowiecki.okt24.vererbung;

import java.util.List;

public class Lkw extends Fahrzeug {

    private int ladeVolumen;

    private List<String> ladung;

    public Lkw() {
        //System.out.println("C: Lkw");
    }

    public Lkw(String kennzeich, String marke, String modell, int leistungInPs, int baujahr, int ladeVolumen) {
        super(kennzeich, marke, modell, leistungInPs, baujahr);
        //System.out.println("C: Lkw");
        this.ladeVolumen = ladeVolumen;
    }

    @Override
    public void printInfo() {
        System.out.println("LKW: " + getKennzeich() + ", " + getMarke() + ", Ladevolumen: " + getLadeVolumen());
    }
    public int getLadeVolumen() {
        return ladeVolumen;
    }

    public void setLadeVolumen(int ladeVolumen) {
        this.ladeVolumen = ladeVolumen;
    }

    public List<String> getLadung() {
        return ladung;
    }

    public void addLadung(String ladung) {
        this.ladung.add(ladung);
    }
}
