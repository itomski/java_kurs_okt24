package de.lubowiecki.okt24;

public class VererbungTest2 {

    public static void main(String[] args) {

        NextStudent s = new NextStudent();

    }
}

class Mensch {

    public Mensch(String s) {
        super();
    }
}

class Student extends Mensch {

    public Student(String s) {
        super(null);
        System.out.println(s);
    }

    public Student() {
        this("Kent");
    }
}
