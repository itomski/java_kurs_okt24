package de.lubowiecki.okt24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class LambdaTest5 {

    public static void main(String[] args) {

        NextStudent[] liste = new NextStudent[6];
        liste[0] = new NextStudent("Peter", "Parker", 123, 21);
        liste[1] = new NextStudent("Bruce", "Banner", 133, 41);
        liste[2] = new NextStudent("Carol", "Danvers", 101, 32);
        liste[3] = new NextStudent("Carol", "Anders", 111, 31);
        liste[4] = new NextStudent("Natasha", "Romanov", 115, 26);
        liste[5] = new NextStudent("Steve", "Rogers", 22, 82);

        //System.out.println(Arrays.toString(liste));

        /*
        for(NextStudent s : liste) {
            System.out.println(s);
        }
        */

        // int compare(T o1, T o2)
        Comparator<NextStudent> compAlter = (s1, s2) -> s1.getAlter() - s2.getAlter();
        // comp1 = (s1, s2) -> s2.getAlter() - s1.getAlter();
        // compAlter = compAlter.reversed();

        Comparator<NextStudent> compVorname = (s1, s2) -> s1.getVorname().compareTo(s2.getVorname());
        Comparator<NextStudent> compNachname = (s1, s2) -> s1.getNachname().compareTo(s2.getNachname());


        // Arrays.sort(liste); // Natürliche Reihenfolge (Comparable)
        //Arrays.sort(liste, compAlter.reversed());
        //Arrays.sort(liste, compVorname);
        Arrays.sort(liste, compVorname.thenComparing(compNachname));
        Arrays.sort(liste, (a, b) -> a.getMatrikelNr() - b.getMatrikelNr());

        Arrays.stream(liste).forEach(System.out::println);


        Predicate pred = (a) -> a.hashCode() > 1000; // Verwendet Object
        Predicate<NextStudent> pred2 = (NextStudent a) -> a.getMatrikelNr() > 1000; // Verwendet NextStudent
        pred2 = a -> a.getMatrikelNr() > 1000; // Besser

    }
}

class NextStudent implements Comparable<NextStudent> {

    private String vorname;

    private String nachname;

    private int matrikelNr;

    private int alter;

    public NextStudent() {
    }

    public NextStudent(String vorname, String nachname, int matrikelNr, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelNr = matrikelNr;
        this.alter = alter;
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

    public int getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(int matrikelNr) {
        this.matrikelNr = matrikelNr;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", matrikelNr=").append(matrikelNr);
        sb.append(", alter=").append(alter);
        sb.append('}');
        return sb.toString();
    }

    // Standardsortierung = natürliche Reihenfolge
    @Override
    public int compareTo(NextStudent other) {
        return matrikelNr - other.matrikelNr;
    }
}
