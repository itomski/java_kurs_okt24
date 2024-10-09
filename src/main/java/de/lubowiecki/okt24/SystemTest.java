package de.lubowiecki.okt24;

public class SystemTest {

    public static void main(String[] args) {

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("user.home"));

        System.out.println(System.getProperty("user.home") + "/data.txt");

    }
}
