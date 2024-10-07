package de.lubowiecki.okt24;

public class DatentypTest {

    public static void main(String[] args) {

        byte a = 100;
        byte b = 100;
        //byte bSum = a + b; // bei math-ops mind int

        // Hier kann ein Über- oder Unterlauf entstehen
        a += b; // a = (byte)(a + b)
        System.out.println(a);
        a++; // a = (byte)(a + 1);

        /*
        byte < short < int < long < float < double
                char <
        */

        int i = a; // primitive widening von byte zu int - automatisch
        a = (byte)i; // primitive narrowing von int zu byte - cast nötig

        double d = a; // primitive widening von byte zu double - automatisch

        Integer j = i; // Autoboxing: int zu Integer
        i = j; // Auto-Un-Boxing: Integer zu int

        // Double d2 = i; // Error: Autoboxing: immer nur zum passenden Wrappertyp
        Number n = i; // Autoboxing: immer nur zum passenden Wrappertyp. Number ist Parent von Integer

    }
}
