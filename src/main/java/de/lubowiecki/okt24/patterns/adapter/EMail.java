package de.lubowiecki.okt24.patterns.adapter;

public class EMail implements Message {

    private final String from;
    private final String to;
    private final String subject;
    private final String body;

    public EMail(String from, String to, String subject, String body) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public void compute() {
        System.out.println("----- SEND E-MAIL -----");
        System.out.println("-- # START");
        System.out.println("-- # FROM: \t" + from);
        System.out.println("-- # TO: \t" + to);
        System.out.println("-- # SUB: \t" + subject);
        System.out.println("-- # BODY: \t" + body);
        System.out.println("-- # END \n");
    }
}
