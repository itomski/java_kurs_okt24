package de.lubowiecki.okt24;

public class InterfaceTest4 {

    public static void main(String[] args) {

        System.out.println(new SportCar());
    }
}

interface NextMovable {

    default void move() {
        System.out.println("MOVE");
    }
}

interface FastMovable extends NextMovable {

    void move(); // Deaktiviert die default-Methode aus NextMovable

    @Override
    String toString(); // Muss in der Kindklasse nicht eingabut werden. Wird von Object vererbt

    @Override
    int hashCode(); // Muss in der Kindklasse nicht eingabut werden. Wird von Object vererbt

    @Override
    boolean equals(Object other); // Muss in der Kindklasse nicht eingabut werden. Wird von Object vererbt
}

class Car implements NextMovable {
}

class SportCar implements FastMovable {

    // Muss eingebaut werden
    @Override
    public void move() {

    }
}