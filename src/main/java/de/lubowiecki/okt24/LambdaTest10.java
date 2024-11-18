package de.lubowiecki.okt24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest10 {

    public static void main(String[] args) {

        Operator1 op1 = (a, b) -> 100;
        int i = op1.doSomething(100, 200);

        //Operator2 op2 = (a) -> System.out.println(a);
        Operator2 op2 = a -> System.out.println(a);

        Operator3 op3 = () -> System.out.println("...");

//        Operator2 op2b = new Operator2() {
//            @Override
//            public void doSomething(int a) {
//
//            }
//        };

        int[] arr = {1,2,3,4,5};
        arrayMethod(arr);
        varArgMethod(arr);

        //arrayMethod(1,2,3); // Error: Erwartet ein int-Array
        varArgMethod(1,2,3);
        varArgMethod();
        varArgMethod(1,2,3,4,5,6,7,8,9);

        System.out.println();

        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(0, 100); // 0
        zahlen.add(0, 110); // 1
        System.out.println(zahlen);

    }

    static void varArgMethod(int... werte) {
        System.out.println(Arrays.toString(werte));
    }

    static void arrayMethod(int[] werte) {
        System.out.println(Arrays.toString(werte));
    }
}

interface Operator1 {
    int doSomething(int a, int b);
    // int doSomething1(int a, int b);
}

interface Operator2 {
    void doSomething(int a);
}

interface Operator3 {
    void doSomething();
}