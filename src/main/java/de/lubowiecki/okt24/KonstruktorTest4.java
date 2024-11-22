package de.lubowiecki.okt24;

public class KonstruktorTest4 {


//    static { // Könnte vor der Main-Methode ausgeführt werden: ExceptionInInitializerError
//        int i = 10;
//        if(i <= 10) {
//            throw new RuntimeException("ABC");
//        }
//    }

    {
        int i = 10;
        if(i <= 10) {
            throw new RuntimeException("ABC");
        }
    }

    public static void main(String[] args) throws Exception {

        KonstruktorTest4 kt4 = new KonstruktorTest4();

        Long l = new Long("123");
        long l2 = l.longValue();

        try {
            try {
                throw new RuntimeException("Run time Exception");
            }
            catch(Exception e) {
                throw new Exception("Exception", e);
            }
        } catch(Exception e) {
            System.out.println(e.getCause().getMessage());
        }
    }
}

class Fruit {

    public Fruit() throws Exception {
    }
}

class Mango extends Fruit {

    public Mango() throws Exception {
        super();
    }
}
