package de.lubowiecki.okt24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        // Referenztyp = ArrayList
        // Objekttyp = ArrayList
        ArrayList<String> list1 = new ArrayList<>();

        // list1 = new LinkedList<>(); // Error: LinkedList IS-NOT-A ArrayList!

        // Referenztyp = List
        // Objekttyp = ArrayList
        List<String> list2 = new ArrayList<>(); // ArrayList IS-A List
        list2.add("Peter");
        list2.add("Bruce");
        list2.add("Carol");

        // Referenztyp = List
        // Objekttyp = LinkedList
        list2 = new LinkedList<>(list2); // Wechsel von ArrayList auf LinkedList

        list2 = new ArrayList<>(list2); // Wechsel von LinkedList auf ArrayList


        ArrayList unsaveList = new ArrayList();
        unsaveList.add(new Person());
        unsaveList.add(123);
        unsaveList.add("Moin");
        // Die Elemente haben eine Indentität auf dem Heap, die ist in der Liste aber nicht bekannt


    }
}
