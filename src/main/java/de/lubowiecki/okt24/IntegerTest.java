package de.lubowiecki.okt24;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;
import static de.lubowiecki.okt24.Wochentag.*;

public class IntegerTest {

    public static void main(String[] args) {

        String text = "Das ist das Haus von Nikigraus";
        int parts = 4;

        System.out.println(text.length() % 4);

        System.out.println(Integer.divideUnsigned(text.length(), 4));
        System.out.println(Integer.remainderUnsigned(text.length(), 4));

        // LocalDate ld = LocalDate.now(); // Factory

        int a, b;
        int[] c, d;
        int e, f[]; // e int, f int-Array
        int[] g, h[]; // g 1d-int-Array, h 2d-int-Array

        int arr1[];
        int[] arr2;
        int[][] arr3;
        int[] arr4[]; // 2d-int-Array

        System.out.println();

        int[] arr5 = {1,2,3,4,5,6,7,8};
        int[] arr6 = Arrays.copyOf(arr5, 14);
        System.out.println(Arrays.toString(arr6));

        out.println("Moin Moin");

        Wochentag t1 = Wochentag.MI;
        Wochentag t2 = MI;

        int x = 10;
        int y = 20;

        //out.println(x++ + y + ++x);
        x = x + y + x++; // postfix geht durch die Neuzuweisung von x verloren
        out.println(x);

        out.println();

        int i = Integer.decode("0x101");
        out.println(i);

//        i = Integer.parseInt("0x101");
//        out.println(i);

        checkList(new ArrayList<>());
        checkList(new LinkedList<>());

        out.println();

        out.println(10.5 * 20);
        out.println((int)10.5 * 20);
        out.println((int)(10.5 * 20));

        out.println();

        StringBuilder sb = new StringBuilder();
        sb.append("1234567890");
        sb.setLength(100);
        out.println(sb.capacity());
        out.println(sb.length());
        out.println(sb);

        sb.setLength(5);
        out.println(sb.capacity());
        out.println(sb.length());
        out.println(sb);
    }

    private static void machWas() throws FileNotFoundException {
        //throw new Exception(); // Exception IS-NOT-A FileNotFoundException
    }

    private static void checkList(List<String> namen)  {
        //throw new Exception(); // Exception IS-NOT-A FileNotFoundException
    }
}

@FunctionalInterface
interface FuncInterFace {

    void doSomething();

    static void doSomethingElse() {

    }

    default void doSomethingElse1() {

    }
}

