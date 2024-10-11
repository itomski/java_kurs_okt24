package de.lubowiecki.okt24;

public class InterfaceTest {

    public static void main(String[] args) {

        Machbar j = new EinfacherJob("Waschen");
        j.machWas();
        j.printJobCount();

        // Statische Methoden des Interface müssen direkt auf dem Interface aufgerufen werden
        Machbar.print();

        System.out.println();

        j = new KomplexerJob("Waschen", "Bügeln", "Müll wegbringen", "Saugen");
        j.machWas();
        j.printJobCount();

    }
}

interface Machbar {

    void machWas();

    default void printJobCount() {
        System.out.println(1);
    }

    // Wird nicht vererbt
    static void print() {
        System.out.println("Machbar...");
    }
}

class EinfacherJob implements Machbar {

    private String job;

    public EinfacherJob(String job) {
        this.job = job;
    }

    @Override
    public void machWas() {
        System.out.println(job +  " erledigen!");
    }
}

class KomplexerJob implements Machbar {

    private String[] jobTeile;

    public KomplexerJob(String... jobTeile) {
        this.jobTeile = jobTeile;
    }

    @Override
    public void printJobCount() {
        System.out.println(jobTeile.length);
    }

    @Override
    public void machWas() {
        for(String jobTeil : jobTeile)
            System.out.println(jobTeil + " erledigen!");
    }
}