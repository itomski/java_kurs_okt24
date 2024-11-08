package de.lubowiecki.okt24;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class IfTest {

    public static void main(String[] args) {

        String str;

        final boolean a;
        a = true;

        if(a) {
            str = "ABC";
        }
        else {
            str = "XYZ";
        }

        System.out.println(str);

        int i = 10;
        Integer j = i; // Autoboxing

        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(10); //0
        zahlen.add(20); //1
        zahlen.add(30); //2
        zahlen.add(3,40); // Muss postiv sein und <= size

        System.out.println(zahlen);

        Period p = Period.of(15, 18, 63);
        System.out.println(p);
        p = p.normalized();
        System.out.println(p);
        System.out.println(p.getDays());
        System.out.println(p.getMonths());
        System.out.println(p.getYears());

        System.out.println();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/M/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MMMM/uuuu");

        LocalDate ldt = LocalDate.of(2000,3,1);
        System.out.println(ldt.format(format1)); // 01/3/2000

        ldt = LocalDate.of(2000,12,1);
        System.out.println(ldt.format(format1)); // 01/12/2000

        ldt = ldt.minusYears(2015);
        System.out.println(ldt.format(format1)); // 01/12/2000
        System.out.println(ldt.format(format2)); // 01/12/2000


    }
}
