package de.lubowiecki.okt24;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class ExcelTest {

    private static final String FILE = System.getProperty("user.home") + "/personal.xlsx";


    public static void main(String[] args) {

        try {
            // saveToExcel();
            
            printFromExcel();
        }
        catch (IOException e) {
            System.out.println("Problem");
        }
    }

    private static void printFromExcel() throws IOException {

        try(InputStream in = new FileInputStream(FILE)) {

            XSSFWorkbook workbook = new XSSFWorkbook(in);
            XSSFSheet sheet = workbook.getSheet("Personal");

            Iterator<Row> rows = sheet.iterator();
            while(rows.hasNext()) {

                Iterator<Cell> cells = rows.next().iterator();
                while(cells.hasNext()) {

                    Cell cell = cells.next();
                    if(cell.getCellType() == CellType.NUMERIC) {
                        System.out.printf(" %-20f ", cell.getNumericCellValue());
                    }
                    else {
                        System.out.printf(" %-20s ", cell.getStringCellValue());
                    }
                }

                System.out.println();
            }
        }

    }

    private static void saveToExcel() throws IOException {

        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"Nr", "Vorname", "Nachname"});
        data.add(new Object[]{"1", "Peter", "Parker"});
        data.add(new Object[]{"2", "Carol", "Danvers"});
        data.add(new Object[]{"3", "Bruce", "Banner"});
        data.add(new Object[]{"4", "Natasha", "Romanov"});

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Personal");

        int i = 0;
        for(Object[] entry : data) {
            Row row = sheet.createRow(i++);

            int j = 0;
            for(Object o : entry) {
                row.createCell(j++).setCellValue((String) o);
            }
        }

        try(OutputStream out = new FileOutputStream(FILE)) {
            workbook.write(out);
        }
    }
}
