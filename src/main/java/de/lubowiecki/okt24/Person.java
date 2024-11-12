package de.lubowiecki.okt24;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.StringJoiner;

public class Person implements Serializable {

    // gehört der Klasse
    private static int count;

    // gehören dem Objekt
    private int nr;

    private String vorname;

    private String nachname;

    private LocalDate geburtsDatum;

    private boolean raucher;

    public Person() {
        nr = ++count;
    }

    public Person(String vorname, String nachname) {
        this();
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

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public boolean isRaucher() {
        return raucher;
    }

    public void setRaucher(boolean raucher) {
        this.raucher = raucher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        //System.out.println("EQUALS: " + vorname + " == " + person.vorname);
        return raucher == person.raucher && Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname) && Objects.equals(geburtsDatum, person.geburtsDatum);
    }

    @Override
    public int hashCode() {
        //System.out.println("HASHCODE: " + vorname);
        return Objects.hash(vorname, nachname, geburtsDatum, raucher);
    }

    /*
    @Override
    public String toString() {
        return "Person{" +
                "nr=" + nr +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsDatum=" + geburtsDatum +
                ", raucher=" + raucher +
                '}';
    }
    */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("nr=").append(nr)
            .append(", vorname='").append(vorname).append('\'')
            .append(", nachname='").append(nachname).append('\'')
            .append(", geburtsDatum=").append(geburtsDatum)
            .append(", raucher=").append(raucher)
            .append('}');
        return sb.toString();
    }


//    @Override
//    public String toString() {
//        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
//                .add("nr=" + nr)
//                .add("vorname='" + vorname + "'")
//                .add("nachname='" + nachname + "'")
//                .add("geburtsDatum=" + geburtsDatum)
//                .add("raucher=" + raucher)
//                .toString();
//    }
}
