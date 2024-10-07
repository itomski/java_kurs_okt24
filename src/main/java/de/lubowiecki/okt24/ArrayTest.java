package de.lubowiecki.okt24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5,7,99,-10};
        System.out.println(arr1);

        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1, 100);
        System.out.println(Arrays.toString(arr1));

        int[][] arr2 = new int[2][]; // {null, null}
        arr2[0] = new int[]{15, 22}; // {{15,22}, null}
        arr2[1] = new int[]{1,3,7,8}; // {{15,22}, {1,3,7,8}}

        var k = 100;
        // k = 10.0; // k ist int

        machWas();

        machWasAnderes();

        var liste1 = new ArrayList<String>();
        //liste1 = new LinkedList<>();

        List<String> liste2 = new ArrayList<>();
        liste2 = new LinkedList<>();

    }

    public static  void machWas() {
        int x = 100;
        int z = 500;

        if(true) {
            x = 15;
            int z2 = 17;
        }

        //System.out.println(z2);

        {
            int x2 = 100;
        }

        //System.out.println(x2);
    }

    public static void machWasAnderes() {
        machWasAnderes();
    }
}
