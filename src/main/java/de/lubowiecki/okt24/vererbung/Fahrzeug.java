package de.lubowiecki.okt24.vererbung;

public abstract class Fahrzeug {

    private String kennzeich;

    private String marke;

    private String modell;

    private int leistungInPs;

    private int baujahr;

    public Fahrzeug() {
    }

    public Fahrzeug(String kennzeich, String marke, String modell, int leistungInPs, int baujahr) {
        // System.out.println("C: Fahrzeug");
        this.kennzeich = kennzeich;
        this.marke = marke;
        this.modell = modell;
        this.leistungInPs = leistungInPs;
        this.baujahr = baujahr;
    }

    public String getKennzeich() {
        return kennzeich;
    }

    public void setKennzeich(String kennzeich) {
        this.kennzeich = kennzeich;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getLeistungInPs() {
        return leistungInPs;
    }

    public void setLeistungInPs(int leistungInPs) {
        this.leistungInPs = leistungInPs;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public abstract void printInfo();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeich='").append(kennzeich).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", modell='").append(modell).append('\'');
        sb.append(", leistungInPs=").append(leistungInPs);
        sb.append(", baujahr=").append(baujahr);
        sb.append('}');
        return sb.toString();
    }
}
