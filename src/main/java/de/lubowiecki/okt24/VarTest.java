package de.lubowiecki.okt24;

import java.util.Arrays;
import java.util.List;

public class VarTest {

    public static void main(String[] args) {

//        VarTest1 vt1 = new VarTest2();
//        System.out.println(vt1.i);
//        vt1.showI();

        VarTest2 vt2a = new VarTest2();
        System.out.println();
        VarTest2 vt2b = new VarTest2();
        System.out.println();
        VarTest2 vt2c = new VarTest2();

        System.out.println();
        System.out.println(vt2a instanceof VarTest2);
        System.out.println(vt2a instanceof VarTest1);
        System.out.println(vt2a instanceof Object);

        long l = 10_000_000_000l;

        System.out.println();

        String[] arr = {"Peter", "Carol", "Bruce", "Steve"};
        List<String> namen = Arrays.asList(arr); // FixedSizeList
        //namen.add("Tony"); // Vergrößern nicht möglich
        //namen.remove(0); // Verkleinern nicht möglich
        namen.set(0, "Natasha"); // Ok

        Object[] oArr = namen.toArray(); // Liefert immer ein Object-Array zurück
        System.out.println(Arrays.toString(oArr));

        String[] sArr = namen.toArray(new String[]{}); // anonymes Array wird für Ermittlung des Datentyps verwendet
        System.out.println(Arrays.toString(sArr));

        System.out.println();

        String[] sArr2 = new String[10];
        sArr = namen.toArray(sArr2); // Array wird mit Daten befüllt
        System.out.println(Arrays.toString(sArr));
        System.out.println(Arrays.toString(sArr2));

        System.out.println();

        sArr2 = new String[2];
        sArr = namen.toArray(sArr2); // Array zu klein, wird für Ermittlung des Datentyps verwendet
        System.out.println(Arrays.toString(sArr));
        System.out.println(Arrays.toString(sArr2));

        System.out.println();

        char[] chars = new char[4];
        System.out.println(Arrays.toString(chars));
        String out = "123456789";
        out.getChars(0, 3, chars, 0);
        for( char c : chars)
            System.out.print(c);


        System.out.println();
        String s = "Peter Parker";
        System.out.println(s.charAt(0));
        System.out.println(Arrays.toString(s.split("e")));

    }
}

class VarTest1 {

    int i = 100;
    int j = 100;

    static {
        System.out.println("SI: VarTest1");
    }

    {
        System.out.println("I: VarTest1");
    }

    {
        System.out.println("I2: VarTest1");
    }

    public VarTest1() {
        System.out.println("C: VarTest1");
    }

    public VarTest1(int i) {
        System.out.println("C2: VarTest1");
    }

    void showI() {
        System.out.println(i * j);
    }
}

class VarTest2 extends VarTest1 {

    int i = 200;

    static {
        System.out.println("SI: VarTest2");
    }

    {
        System.out.println("I: VarTest2");
    }

    public VarTest2() {
        super(10);
        System.out.println("C: VarTest2");
    }

    @Override
    void showI() {
        System.out.println(i * j);
    }
}
