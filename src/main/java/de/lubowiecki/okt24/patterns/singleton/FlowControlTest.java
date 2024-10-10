package de.lubowiecki.okt24.patterns.singleton;

import de.lubowiecki.okt24.Wochentag;

import java.util.Random;

public class FlowControlTest {

    public static void main(String[] args) {

        int alter = 15;
        System.out.println("Ich bin " + ((alter > 16) ? "alt genug" : "nicht alt genug"));
        String str = (alter > 16) ? "alt genug" : "nicht alt genug";

        boolean ok;

        if(ok = true) {
            System.out.println("OK");
        }

        if(true == ok) {
            System.out.println("OK");
        }

        Wochentag tag = Wochentag.MI;

        switch(tag) {
            case MO -> System.out.println("MO"); // mit -> braucht man kein break
            case DI -> System.out.println("DI");
            case MI -> System.out.println("MI");
            case DO -> System.out.println("DO");
            case FR -> System.out.println("FR");
            case SA -> System.out.println("SA");
            case SO -> System.out.println("SO");
        }

        tag = Wochentag.DO;

        System.out.println("Tage bis Ende der Woche: ");

        switch(tag) {
            case MO: System.out.println("MO"); // mit -> braucht man kein break
            case DI: System.out.println("DI");
            case MI: System.out.println("MI");
            case DO: System.out.println("DO");
            case FR: System.out.println("FR");
            case SA: System.out.println("SA");
            case SO: System.out.println("SO");
        }

        // Ab Java 14

        String str2 = switch(tag) {
            case MO -> "Start der Woche";
            case DI -> "Schon mal was vorbei";
            case MI -> "Bergfest";
            case DO -> {
                yield "Noch bisschen durchhalten";
            }
            case FR -> "Das Ende ist fast da";
            case SA, SO -> "Wochenende";
        };

        System.out.println(str2);


        /*
        for(;;) {
            System.out.println("Moin");
        }
        */

        //for(;;System.out.println("Moin"));

        int i = 0;
        for(; i < 100; System.out.println("Moin"), i++);

        int[] arr = {10,20,30,40};

        // int j; // Variable muss im for deklariert sein
        for(int j : arr) {
            System.out.println(j);
        }

        System.out.println();

        Random rand = new Random();
        System.out.println(rand.nextInt(6) + 1);
        System.out.println(rand.nextInt(6) + 1);
        System.out.println(rand.nextInt(6) + 1);
        System.out.println(rand.nextInt(6) + 1);

        System.out.println();

        System.out.println((int)(Math.random() * 6) + 1);
        System.out.println((int)(Math.random() * 6) + 1);
        System.out.println((int)(Math.random() * 6) + 1);
        System.out.println((int)(Math.random() * 6) + 1);

    }
}
