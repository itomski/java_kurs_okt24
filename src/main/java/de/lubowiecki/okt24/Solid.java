package de.lubowiecki.okt24;

public class Solid {

    public static void main(String[] args) {

        Drucker d = new Drucker();
        printText(d, "Hallo Interface");

    }

    static void printText(PrintDevice pd, String txt) {
        pd.print(txt);
    }

    static void scanText(ScanDevice sd, String txt) {
        sd.scan(txt);
    }
}

interface MultiFuncDevice extends ScanDevice, PrintDevice {

}

interface ScanDevice {

    void scan(String text);

}

interface PrintDevice {

    void print(String text);

}

class Drucker implements PrintDevice {

    @Override
    public void print(String text) {
        System.out.println("Ich drucke den Text: " + text);
    }
}

class MuliFuncDrucker implements MultiFuncDevice {

    @Override
    public void print(String text) {
        System.out.println("Ich drucke den Text: " + text);
    }

    @Override
    public void scan(String text) {

    }
}