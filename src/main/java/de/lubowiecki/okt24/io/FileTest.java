package de.lubowiecki.okt24.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {

        try(BufferedWriter out = new BufferedWriter(new FileWriter("text.txt", true))) {
            out.write("Das ist das Haus von Nikigraus.");
            // aut wird beim Verlassen des try-Blocks automatisch geschlossen
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
