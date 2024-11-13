package de.lubowiecki.okt24;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaTest9 {

    public static void main(String[] args) {

        // Generischer Typ muss eine Kindklasse von Number sein
        // MOp<String> op1 = (s1, s2) -> s1.concat(s2);
        // System.out.println(op1.run("A", "B"));

        MOp<Double> op1 = (a, b) -> a + b;
        MOp<Double> op2 = (a, b) -> a * b;
        MOp<Integer> op3 = (a, b) -> a * b;

        MOp<Double> op6 = new Add(); // Ohne Lambda
        System.out.println(op6.run(10.0, 22.0));

        MOp<Double> op7 = new MOp<Double>() { // Anonyme Klasse
            @Override
            public Double run(Double a, Double b) {
                return a * b;
            }
        };
        System.out.println(op7.run(10.0, 22.0));

        System.out.println(op3.run(10, 17));
        System.out.println(op2.run(10.15, 17.22));

        System.out.println();

        BinaryOperator<Double> op4 = (a, b) -> a * b;
        System.out.println(op4.apply(10.5, 22.7));

        // int, long, double
        DoubleBinaryOperator op5 = (a, b) -> a * b;
        System.out.println(op5.applyAsDouble(10.5, 22)); // verwendet automatisch primitive widening

        IntBinaryOperator op8 = (a, b) -> a * b;
        System.out.println(op8.applyAsInt(10, 22));
    }
}

class Add implements MOp<Double> {

    @Override
    public Double run(Double a, Double b) {
        return a * b;
    }
}


interface MOp<T extends Number> {

    T run(T a, T b);

}
