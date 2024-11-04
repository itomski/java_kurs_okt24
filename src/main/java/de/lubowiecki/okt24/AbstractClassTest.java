package de.lubowiecki.okt24;

public class AbstractClassTest {

    public static void main(String[] args) {

        ExcelTableManagement excel = new ExcelTableManagement();
        System.out.println(excel.TABLE_TYPE);

        // TableManagement tm = new TableManagement("SQL");

        long l = 10_000_000_000l;
        l = 030l;
        System.out.println(l);
        l = 0b100l;
        System.out.println(l);
        l = 0x10l;
        System.out.println(l);

    }

}

abstract class TableManagement {

    public final String TABLE_TYPE;

    public TableManagement(String type) {
        this.TABLE_TYPE = type;
    }
}

class ExcelTableManagement extends TableManagement {

    public ExcelTableManagement() {
        super("EXCEL");
    }
}


