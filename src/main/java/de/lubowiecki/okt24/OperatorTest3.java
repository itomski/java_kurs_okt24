package de.lubowiecki.okt24;

import java.time.LocalTime;
import java.util.Arrays;

public class OperatorTest3 {

    public static void main(String[] args) {

        int i = 2;
        boolean a = false;
        boolean b = a=true ? ++i>2 ? true : false : ++i<2 ? true : false;

        System.out.println();

        String aStr = new String("Moin");
        String bStr = new String("Moin");
        System.out.println(aStr.equals(bStr));
        System.out.println(aStr == bStr);
        System.out.println(aStr.hashCode());
        System.out.println(bStr.hashCode());

        System.out.println();

        LocalTime aTime = LocalTime.of(15,22);
        LocalTime bTime = LocalTime.of(15,22);
        System.out.println(aTime.equals(bTime));
        System.out.println(aTime == bTime);
        System.out.println(aTime.hashCode());
        System.out.println(bTime.hashCode());


        for(int j = 10; j > 100; j++)
            System.out.println("MUSS!!!!");

        int j = 10;
        while(j > 100)
            System.out.println("MUSS!!!!");

        do {
            System.out.println("MUSS!!!!");
        }
        while(j > 100);


        int[] arr = {1,2,3,4,5};
        Object o = arr;
        // System.out.println(o[3]); // Error
        int[] arr2 = (int[])o; // Ok
        // double[] arr3 = (double[])o; // ClassCastException
        System.out.println(Arrays.toString(arr2));



    }

}
