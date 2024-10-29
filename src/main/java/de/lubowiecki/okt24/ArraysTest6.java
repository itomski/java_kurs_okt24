package de.lubowiecki.okt24;

import java.util.Arrays;

public class ArraysTest6 {

    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {1,2,3,4,5};

        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr1, arr2));


    }


}
