package de.lubowiecki.okt24.a;

public class Child extends Parent { // Hier nur public und default möglich

    public static void main(String[] args) {

        // public int y = 100; // Hier keine Access-Modifier

        Child ch1 = new Child();
        System.out.println(ch1.x); // Sichtbar, da Child IS-A Parent

        Parent p1 = new Parent();

        //Ok, da beide Klassen im gleichen Package liegen
        System.out.println(p1.x); // Sichtbar, da protected offener ist als package-private
    }

    // Kann auch static sein
    class Sub { // Innere Klasse: Kann private, default, protected oder private sein
    }
}
