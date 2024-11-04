package de.lubowiecki.okt24;

public class DestructorTest {

    public static void main(String[] args) {
        try {
            DestA a1 = new DestA();
            DestA a2 = new DestA();
            DestA a3 = new DestA();
            a1 = null;
            a2 = null;
            a3 = null;

            System.gc();

            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class DestA {

    @Override
    public void finalize() { // Destructor
        System.out.println("UGHRRRRRR.....");
    }
}
