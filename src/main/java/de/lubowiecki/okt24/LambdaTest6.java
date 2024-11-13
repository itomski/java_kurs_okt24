package de.lubowiecki.okt24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest6 {

    public static void main(String[] args) {

        VertragsPartei p1 = new VertragsPartei("Peter", "Parker");
        VertragsPartei p2 = new VertragsPartei("Carol", "Danvers");
        VertragsPartei p3 = new VertragsPartei("Bruce", "Banner");
        VertragsPartei p4 = new VertragsPartei("Natasha", "Romanov");

        List<Vertrag> vertraege = new ArrayList<>();
        vertraege.add(new Vertrag("Superheld-Rahmenvertrag", p1, p2, true, LocalDate.of(2000, 10, 7)));
        vertraege.add(new Vertrag("Superheld-Rahmenvertrag", p2, p1, true, LocalDate.of(2020, 12, 1)));
        vertraege.add(new Vertrag("Superheld-Rahmenvertrag", p2, p1, false, LocalDate.of(2015, 7, 3)));
        vertraege.add(new Vertrag("Superheld-Rahmenvertrag", p4, p1, true, LocalDate.of(1999, 6, 23)));

        final String FMT = "| %25s | %20s | %20s | %6s | %12s |\n";

        // void accept(T t);
        Consumer<Vertrag> ausgabe = v -> System.out.printf(FMT, v.getName(), v.getPartei1(), v.getPartei2(), v.isAktiv(), v.getVon());

        // boolean test(T t);
        // Predicate<Vertrag> auswahlAktiv = v -> v.isAktiv();
        Predicate<Vertrag> auswahlAktiv = Vertrag::isAktiv;

        Predicate<Vertrag> auswahlVor2000 = v -> v.getVon().isBefore(LocalDate.of(2000, 1, 1));

        //vertraege.removeIf(auswahlAktiv.negate());
        //vertraege.removeIf(auswahlVor2000.negate());
        vertraege.removeIf(auswahlVor2000.or(auswahlAktiv.negate()));

        vertraege.forEach(ausgabe);
    }
}

class Vertrag {

    private String name;

    private VertragsPartei partei1;

    private VertragsPartei partei2;

    private boolean aktiv;

    private LocalDate von;

    public Vertrag() {
    }

    public Vertrag(String name, VertragsPartei partei1, VertragsPartei partei2, boolean aktiv, LocalDate von) {
        this.name = name;
        this.partei1 = partei1;
        this.partei2 = partei2;
        this.aktiv = aktiv;
        this.von = von;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VertragsPartei getPartei1() {
        return partei1;
    }

    public void setPartei1(VertragsPartei partei1) {
        this.partei1 = partei1;
    }

    public VertragsPartei getPartei2() {
        return partei2;
    }

    public void setPartei2(VertragsPartei partei2) {
        this.partei2 = partei2;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public LocalDate getVon() {
        return von;
    }

    public void setVon(LocalDate von) {
        this.von = von;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vertrag{");
        sb.append("name='").append(name).append('\'');
        sb.append(", partei1=").append(partei1);
        sb.append(", partei2=").append(partei2);
        sb.append(", aktiv=").append(aktiv);
        sb.append(", von=").append(von);
        sb.append('}');
        return sb.toString();
    }
}

class VertragsPartei {

    private String vorname;

    private String nachname;

    public VertragsPartei() {
    }

    public VertragsPartei(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname;
    }
}


