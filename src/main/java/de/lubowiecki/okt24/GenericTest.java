package de.lubowiecki.okt24;

public class GenericTest {

    public static void main(String[] args) {

        IntContentBox cb1 = new IntContentBox(100);
        System.out.println(cb1.getContent());
        cb1.setContent(200);
        System.out.println(cb1.getContent());

        DoubleContentBox cb2 = new DoubleContentBox(100.5);
        System.out.println(cb2.getContent());
        cb2.setContent(200.123);
        System.out.println(cb2.getContent());


        ContentBox<Integer> cb3 = new ContentBox<>(80);
        System.out.println(cb3.getContent());
        cb3.setContent(40);
        System.out.println(cb3.getContent());

        ContentBox<String> cb4 = new ContentBox<>("Butter");
        System.out.println(cb4.getContent());
        cb4.setContent("Milch");
        System.out.println(cb4.getContent());


    }
}

class IntContentBox {

    private int content;

    public IntContentBox(int content) {
        this.content = content;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
}

class DoubleContentBox {

    private double content;

    public DoubleContentBox(double content) {
        this.content = content;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }
}

class ContentBox<E> {

    private E content;

    public ContentBox(E content) {
        this.content = content;
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }
}
