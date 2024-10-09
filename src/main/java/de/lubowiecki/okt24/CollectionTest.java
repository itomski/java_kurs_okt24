package de.lubowiecki.okt24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {



        //Iterable<Integer> itr = new ArrayList<>();
        //Iterable<Integer> itr = List.of(1,5,7,10,22,15,99);
        Iterable<Integer> itr = Arrays.asList(1,5,7,10,22,15,99); // vor Java 1.9

        for(int i : itr) {
            System.out.println(i);
        }

        System.out.println();

        itr.forEach(e -> System.out.println(e)); // Consumer

    }
}
