package de.lubowiecki.okt24;

public class LambdaTest4 {

    public static void main(String[] args) {

        // void show(String s)
        StringView sv = s -> System.out.println(s);
        sv.show("Hallo Lambda");

        System.out.println();

        sv = System.out::println; // Methodenreferenz
        sv.show("Hallo Lambda");

        System.out.println();

        sv = LambdaTest4::machWas; // Methodenreferenz
        sv.show("Hallo Lambda");

        System.out.println();

        // double exec(double a, double b)
        MathOperation op1 = (x, y) -> x * y;
        System.out.println(op1.exec(10, 20));

        MathOperation op2 = LambdaTest4::add;
        System.out.println(op2.exec(10, 20));
    }

    static void machWas(String wert) {
        System.out.println("####" + wert + "####");
    }

    static double add(double d1, double d2) {
        return d1 + d2;
    }
}

interface StringView {
    void show(String s);
}

interface MathOperation {
    double exec(double a, double b);
}