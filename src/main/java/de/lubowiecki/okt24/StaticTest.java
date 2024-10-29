package de.lubowiecki.okt24;

public class StaticTest {

    private static int i;

    public static void main(String[] args) {

        System.out.println(i);

        StaticTest st = new StaticTest();
        st.i = 100;

        System.out.println(i);
        System.out.println(st.i);

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Problem");
        }

        System.out.println();

        try {
            Double d = 10.0 / 0.0;
            System.out.println(d.isInfinite());
            System.out.println(Double.isInfinite(10.0/0.0));

        } catch (ArithmeticException e) {
            System.out.println("Problem");
        }
    }
}
