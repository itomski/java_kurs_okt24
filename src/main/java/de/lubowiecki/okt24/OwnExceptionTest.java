package de.lubowiecki.okt24;

public class OwnExceptionTest {

    public static void main(String[] args) {

        try {
            check(11);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Eingabe war falsch...");
        }
        catch (ZuAltException e) {
            System.out.println("Leider schon zu weit von jung entfernt... Sorry");
        }
        catch (ZuJungException e) {
            System.out.println("Leider bist du noch zu klein... Sorry");
        }
    }


    public static void check(int age) throws RuntimeException {
        if(age > 0 && age < 12) {
            throw new ZuJungException("...");
        }
        else if(age >= 12 && age < 99){
            System.out.println("Ok!");
        }
        else {
            if(age <= 0) throw new IllegalArgumentException("...");

            if(age >= 100) throw new ZuAltException("...");
        }
    }
}

class ZuAltException extends RuntimeException {

    public ZuAltException(String message) {
        super(message);
    }
}

class ZuJungException extends RuntimeException {

    public ZuJungException(String message) {
        super(message);
    }
}