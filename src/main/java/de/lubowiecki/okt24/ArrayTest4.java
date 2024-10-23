package de.lubowiecki.okt24;

import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest4 {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>(List.of("Peter", "Bruce", "Carol", "Natasha"));

        Object[] objArr = namen.toArray(); // Liefert IMMER ein Object-Array

        // Parameter ist für die Rückgabe-Typ-Ermittlung relevant
        String[] strArr = namen.toArray(new String[]{});
        System.out.println(Arrays.toString(strArr));

        // Integer[] intArr = namen.toArray(new Integer[]{}); // Exception

        System.out.println();

        strArr = new String[3];
        // Parameter ist für die Rückgabe-Typ-Ermittlung relevant
        // Ist das Array zu klein, wird für die Rückgabe ein neues erzeugt
        String[] strArrCopy = namen.toArray(strArr);
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(strArrCopy));

        System.out.println();

        strArr = new String[10];
        // Parameter ist für die Rückgabe-Typ-Ermittlung relevant
        // Ist das Array ausreichend groß, dann wird es selbst befüllt
        strArrCopy = namen.toArray(strArr);
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(strArrCopy));


        System.out.println();

        StringBuilder sb = new StringBuilder("0123456789");
        char[] chars = new char[4];
        sb.getChars(1, 5, chars, 1); //  [,1,2,3,4] : Exception
        System.out.println(Arrays.toString(chars));


        Year y = Year.of(2000);
        YearMonth ym = y.atMonth(10);
        LocalDate ld = ym.atDay(25);
        MonthDay md = MonthDay.of(2, 10);

    }
}
