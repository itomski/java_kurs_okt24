import java.io.*;
import java.util.Properties;

public class PropertyTest {

    private static final String SAVE_FILE;

    static {
        // user.home = Benutzerordner
        //SAVE_FILE = System.getProperty("user.home") + "/config.properties";
        SAVE_FILE = System.getProperty("user.home") + "/config.xml";
    }

    public static void main(String[] args) {

        Properties prop = new Properties();
        prop.setProperty("db.url", "jdbc:mysql://localhost:8080");
        prop.setProperty("db.user", "tomasz");
        prop.setProperty("db.password", "geheim");

        try {
            //save(prop);

            Properties prop2 = load();
            System.out.println(prop2);
            System.out.println(prop2.getProperty("db.user"));
            System.out.println(prop2.getProperty("db.password"));
            System.out.println(prop2.getProperty("db.url"));

        }
        catch (IOException e) {
            System.out.println("Problem");
        }
    }

    private static void save(Properties prop) throws IOException {

        try(OutputStream out = new FileOutputStream(SAVE_FILE)){
            // prop.store(out, null);
            prop.storeToXML(out, null);
        }
    }

    private static Properties load() throws IOException {

        try(InputStream in = new FileInputStream(SAVE_FILE)){
            Properties prop = new Properties();
            //prop.load(in);
            prop.loadFromXML(in);
            return prop;
        }
    }
}
