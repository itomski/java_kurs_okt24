package de.lubowiecki.okt24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SublistTest {

    public static void main(String[] args) {

        List liste = new ArrayList();
        liste.add("a");
        liste.add("b");
        liste.add(1, "c");
        liste.addAll(liste.subList(1,1));
        System.out.println(liste);

        A2 a2 = new A2();
        AA2 aa2 = new AA2();
        a2 = aa2;

        System.out.println(a2.getClass());
        System.out.println(aa2.getClass());

        Long l = 100L;
        int j = (Integer) l.intValue() / 10;

        String s = "Moin";
        System.out.println(s.length());
        StringBuilder sb = null;

        byte b = 125;
        char c = 100;

        System.out.println();

        List<Integer> zahlen = new ArrayList<>(List.of(5,7,22,18,5,19,0));
        for(Integer i : zahlen) {
            System.out.println(i);
        }

        System.out.println();

        zahlen.forEach(e -> System.out.println(e));

        System.out.println();

        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Kiel", 300_000);
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("München", 1_600_000);

        for(int e : einwohner.values()) {
            System.out.println(e);
        }

        System.out.println();

        for(String k : einwohner.keySet()) {
            System.out.println(k + ": " + einwohner.get(k));
        }

        System.out.println();

        for(Map.Entry<String, Integer> e : einwohner.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println();

        einwohner.forEach((k, v) -> System.out.println(k + ": " + v));


        Object o = new Object();
        System.out.println(o.hashCode());

        String go = "ABC";
        switch(go) {
            case "ABC": {
                    String go1 = "XYZ"; // Scope ist der Case
                }
                break;

            case "CDE": {
                    String go2 = "123"; // Scope ist die gesamte switch-Anweisung
                }
                break;
        }

        //System.out.println(go2); // Error: go2 ist out-of-scope

    }
}

class A2 {

}

class AA2 extends A2 {

}