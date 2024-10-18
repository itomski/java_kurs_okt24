package de.lubowiecki.okt24;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaBindingTest {

    private int zahl = 1000;

    public static void main(String[] args) {

        // Klassenkontext (main ist static)

        String s = "Value: ";

        // Wird eine lokale (außerhalb des Lambdas deklarierte) Variable im Lambda verwendet,
        // so muss sie final oder effektiv final

        Printer<String> sp = t -> System.out.println(s + t);
        sp.print("ABC");

        Printer<Integer> ip = n -> System.out.println(s + n);
        ip.print(1);

        // s = "Wert: ";

        new LambdaBindingTest().start();
    }

    private void start() {

        int zahl = 100;

        // Instanzkontext (start ist eine Instanzmethode)

        Printer<String> sp = t -> System.out.println(t + zahl); // Lokale zahl
        sp.print("ABC");

        Printer<Integer> ip = n -> System.out.println(n + this.zahl); // Instanz zahl
        ip.print(1);

        System.out.println();

        // void accept(T t)
        Consumer<String> cs = t -> System.out.println(t);
        cs.accept("dksahlkd dsaksadlj dsklsdjlads");

        System.out.println();

        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Carol");
        namen.add("Steve");
        namen.add("Natasha");
        namen.add("Bruce");
        namen.add("Scott");

        //namen.forEach(cs);
        namen.forEach(n -> System.out.println(n.toUpperCase()));

        // double exec(double a, double b)
        // MathOp add = (a, b) -> a + b;

        //BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        BinaryOperator<Double> add = (a, b) -> a + b;
        System.out.println(add.apply(10.0, 1.2));

        System.out.println();

        final Supplier<Integer> W6 = () -> (int)(Math.random() * 6) + 1;
        final Supplier<Integer> W10 = () -> (int)(Math.random() * 10) + 1;
        final Supplier<Integer> W20 = () -> (int)(Math.random() * 20) + 1;
        final Supplier<Integer> W100 = () -> (int)(Math.random() * 100) + 1;

        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W100.get());
        System.out.println(W20.get());
        System.out.println(W10.get());

        System.out.println();

        // Predicate: boolean test(T t)
        //namen.removeIf((w) -> w.startsWith("S"));
        namen.removeIf((w) -> w.length() > 5);
        namen.forEach(n -> System.out.println(n));

    }
}

interface Printer<T> {
    void print(T val);

    String toString(); // Methode von Object
}

