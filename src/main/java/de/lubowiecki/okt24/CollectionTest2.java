package de.lubowiecki.okt24;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionTest2 {

    public static void main(String[] args) {

        Queue<String> namen = new LinkedList<>();

        namen.offer("Peter");
        namen.offer("Bruce");
        namen.offer("Carol");
        namen.offer("Scott");

        while(!namen.isEmpty()) {
            String s = namen.poll();
            System.out.println(s);
        }

        System.out.println(namen);

        System.out.println();

        // Verwendung als Stack
        Deque<String> namen2 = new LinkedList<>();

        namen2.push("Peter");
        namen2.push("Bruce");
        namen2.push("Carol");
        namen2.push("Scott");

        while(!namen2.isEmpty()) {
            String s = namen2.pop();
            System.out.println(s);
        }

        System.out.println(namen2);


    }
}
