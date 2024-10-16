package de.lubowiecki.okt24;

public class ExceptionTest2 {

    public static void main(String[] args) {

        int[] arr = null;
        // System.out.println(arr[0]);
        // arr[0] = 10;

        // String s = (String) Integer.valueOf(10); // Compilererror

        Object o = Integer.valueOf(10);
        //o = new String("....");
        //String s = (String) o; // ClassCastException: Integer IS-NOT-A String

        Exception e = new IllegalArgumentException("....");
        //NullPointerException ex = (NullPointerException) e; // ClassCastException: IllegalArgumentException IS-NOT-A NullPointerException

        int i = Integer.parseInt("0x12"); // NumberFormatException
        // int i = Integer.decode("0x12");
        System.out.println(i);

        int j = 42;
        System.out.println("Moin " + j);
        Integer jj = 42;
        System.out.println("Moin " + jj);
        // String s = jj;


        try {
            try {
                arr[0] = 10; // NullPointerException
            } catch (NullPointerException ex) {
                throw new RuntimeException("Array nicht vorhanden", ex);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            //System.out.println(ex.getMessage());
            //System.out.println(ex.getCause());
        }

    }
}
