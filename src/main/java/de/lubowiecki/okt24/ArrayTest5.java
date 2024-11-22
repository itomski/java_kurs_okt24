package de.lubowiecki.okt24;

public class ArrayTest5 {

    public static void main(String[] args) {

        int[] arr = null;
        int idx = 1;
        try {
            System.out.println(arr[idx = 2]++);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(idx);

        //1 = 2;
        //false = true;

        boolean b1 = false;
        boolean b2 = false;
        //if(b2 != b1 = !b2) { // Error!!!!
        if(b2 != (b1 = !b2)) { // Ok
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
