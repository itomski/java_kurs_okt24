package de.lubowiecki.okt24;

public class LambdaTest2 {

    public static void main(String[] args) {

        // double exec(double a, double b)
        MathOp add = (a, b) -> a + b;

        System.out.println(add.exec(10, 20));
        System.out.println(add.exec(17, -20));
        System.out.println(add.exec(8, 2));

        System.out.println();

        MathOp div = (x, y) -> x / y;
        System.out.println(div.exec(8, 2));

        System.out.println();

        MathOp op = (double i, double j) -> i - j;
        System.out.println(op.exec(8, 2));
        System.out.println(op.exec(7, 1));
        System.out.println(op.exec(22, 17));

        System.out.println();

        op = (a, b) -> {
            System.out.println("A: " + a);
            System.out.println("B: " + b);
            return a * b;
        };
        System.out.println(op.exec(8, 2));
        System.out.println(op.exec(7, 1));
        System.out.println(op.exec(22, 17));

        System.out.println();

        IntValidator val1 = (zahl) -> zahl >= 0 && zahl < 1000;
        val1 = z -> z >= 0 && z < 1000;

        System.out.println(val1.check(-100));
        System.out.println(val1.check(100));
        System.out.println(val1.check(1010));

        System.out.println();

        // void print(String s);
        StringPrinter sp = text -> System.out.println(text);
        sp.print("Das ist ein Haus von Nikigraus");

        sp = t -> System.out.println(t.toUpperCase());
        sp.print("Das ist ein Haus von Nikigraus");
    }
}

@FunctionalInterface // Prüft die Regeln für ein FunctionalInterface
interface MathOp {
    double exec(double a, double b);
}

interface IntValidator {
    boolean check(int num);
}

interface StringPrinter {
    void print(String s);
}
