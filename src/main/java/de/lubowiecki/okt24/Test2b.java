package de.lubowiecki.okt24;

import java.util.List;

public class Test2b {

    public static void main(String[] args) {

        ATest at1 = new ATest();
        System.out.println(at1.x);
        System.out.println(at1.y);
        System.out.println(ATest.y);
        at1.machWas();
        at1.machWasStatic();
        ATest.machWasStatic();

        System.out.println();

        ATest at2 = new BTest();
        System.out.println(at2.x);
        System.out.println(at2.y);
        System.out.println(BTest.y);
        at2.machWas();
        at2.machWasStatic();
        BTest.machWasStatic();

        String s = null;
        Person p = null;
        System.out.println();

        //machWas(null);

        System.out.println();

        int[] arrI = {1,2,3};
        // double[] arrD = arrI; // Error
        Object o = arrI;
        Integer[] arrIObj = {1,2,3};
        //Double[] arrDObj = arrIObj; // Error
        Number[] arrNObj = arrIObj;
        Object[] arrObj = arrIObj;

        Integer i = 10;
        i.equals(null);

        byte b = 10;
        // Integer j = b; // Byte ist nicht Integer!!!

        char c = 'A';
        // c = c + 1; // Error
        c++; // Ok c = (char)(c + 1)

        int jj = 10_000;
        System.out.println((char)jj);

    }

    public static void machWas(List<String> liste) {
        liste.add("...");
    }

}

class ATest {

    public int x = 100;
    public static int y = 200;

    public void machWas() {
        System.out.println("ATest");
    }

    public static void machWasStatic() {
        System.out.println("ATest Static");
    }
}

class BTest extends ATest {

    public int x = 1000;
    public static int y = 2000;

    public void machWas() {
        System.out.println("BTest");
    }

    public static void machWasStatic() {
        System.out.println("BTest Static");
    }
}
