package de.lubowiecki.okt24;

import java.util.ArrayList;

public class ObjectChaining {

    public static void main(String[] args) {

        Chain chain = new Chain();
        chain.addContent("Hallo ").addContent("Welt")
                .addContent("A")
                .addContent("B")
                .addContent("C");

        System.out.println(chain);

        Integer i = null;
        // System.out.println(i++); // NullPointerException
        // System.out.println(i += 10); // NullPointerException

        int j = 0;
        System.out.println(j++);
        System.out.println(j += 10);

        System.out.println();

        i = 10;
        j = -10;

        System.out.println(i % 3);
        System.out.println(i % -3);
        System.out.println(j % 3);
        System.out.println(j % -3);

        if(i == 10)
            System.out.println("OK");
        else
            System.out.println("Nicht OK");

    }
}

class Chain {

    private String content = "";

    public Chain addContent(String content) {
        this.content += content;
        return this;
    }

    @Override
    public String toString() {
        return content;
    }
}
