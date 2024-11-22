package de.lubowiecki.okt24;

public class ToStringTest2 {

    public static void main(String[] args) {

        System.out.println(new Abcd().s);

        String s = null;
        System.out.println(s + "Hallo");

        System.out.println();

        String m1 = "Moin";
        // String m2 = new String("Moin"); // Erzeugt ein neues Objekt. Werwendet nicht den Pool
        String m2 = new String("Moin").intern(); // Nutzt die das Objekt aus dem Pool
        String m3 = "Mo" + "in"; // Nutzt die das Objekt aus dem Pool
        String m4 = "Mo".concat("in"); // Nutzt die das Objekt aus dem Pool
        System.out.println(m1.equals(m2));
        System.out.println(m1 == m2);

        String s1 = null;
        System.out.println(s1 + "...");
        // System.out.println(s1.concat("...")); // NullPointerException

        Integer i = 100;
        System.out.println(i);
        change(i);
        System.out.println(i);

        String s2 = "Moin";
        String s3 = "Tach";
        System.out.println(s2.equals(s2 = s3));
        System.out.println(s2);
        System.out.println(s2.equals(s2));

        System.out.println(Math.ceil(-0.5)); // Aufrunden
        System.out.println(Math.floor(-0.5)); // Abrunden
        System.out.println(Math.round(-1.5)); // Mathematisch runden


    }

    public static void change(Integer i) {
        i++; // i = i + 1;
        System.out.println("Intern: " + i);
    }

}

class Abcd {

    int a = 10;

    int b = this.hashCode();

    String s = this.toString();

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Abcd{");
//        sb.append("a=").append(a);
//        sb.append(", b=").append(b);
//        sb.append(", s='").append(s).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
}
