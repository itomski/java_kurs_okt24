package de.lubowiecki.okt24;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest7 {

    public static void main(String[] args) {

        PersonCreator pc = (a, b) -> {
            Person p = new Person(a, b);
            p.setGeburtsDatum(LocalDate.now());
            return p;
        };

        PersonCreator pcRaucher = (a, b) -> {
            Person p = new Person(a, b);
            p.setGeburtsDatum(LocalDate.now());
            p.setRaucher(true);
            return p;
        };

        Person p1 = pc.create("Peter", "Parker");
        System.out.println(p1);

        Person p2 = pcRaucher.create("Peter", "Parker");
        System.out.println(p2);

        System.out.println();

        System.out.println(pc.createAutomatic());
        System.out.println(pc.createAutomatic());
        System.out.println(pcRaucher.createAutomatic());
        System.out.println(pcRaucher.createAutomatic());

        System.out.println();

        // Supplier<T>: T get();
        List<Person> personen = Stream.generate(pc::createAutomatic)
                                    .limit(200)
                                    .collect(Collectors.toList());

        // int compare(T o1, T o2);
        Comparator<Person> nachVornamen = (pA, pB) -> pA.getVorname().compareTo(pB.getVorname());
        Comparator<Person> nachNachnamen = (pA, pB) -> pA.getNachname().compareTo(pB.getNachname());

        //personen.sort(nachVornamen);
        //personen.sort(nachNachnamen);
        personen.sort(nachVornamen.thenComparing(nachNachnamen));

        System.out.println(personen);

        for(Person p : personen) {
            System.out.println(p.getVorname() + " " + p.getNachname());
        }
    }
}

@FunctionalInterface
interface PersonCreator {

    String[] vornamen = {"Peter", "Bruce", "Carol", "Natasha", "Scott"};
    String[] nachnamen = {"Parker", "Banner", "Danvers", "Romanov", "Lang"};
    Random rand = new Random();

    Person create(String vorname, String nachname);

    default Person createAutomatic() {
        return create(vornamen[rand.nextInt(5)], nachnamen[rand.nextInt(5)]);
    }

    // Alle Instanz-Methoden von Object sind für FunctionalInterfaces nicht relevant
    @Override
    String toString();

    @Override
    boolean equals(Object o);

    // statische und default Methoden sind auch erlaubt
}
