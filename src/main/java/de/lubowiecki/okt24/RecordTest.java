package de.lubowiecki.okt24;

public class RecordTest {

    public static void main(String[] args) {

        Customer c1 = new Customer("Peter", "Parker");
        System.out.println(c1.firstname() + " " + c1.lastname());
        System.out.println(c1);

        Customer c2 = new Customer("Peter", "Parker");
        System.out.println(c2.firstname() + " " + c2.lastname());
        System.out.println(c2);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

    }
}

record Customer(String firstname, String lastname) {}
