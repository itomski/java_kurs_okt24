package de.lubowiecki.okt24.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JsonTest {

    private static final String FILE = System.getProperty("user.home") + "/data.json";

    private static final ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.registerModule(new JavaTimeModule());
    }

    public static void main(String[] args) {

        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Peter", "Parker", LocalDate.of(1998, 10,7)));
        personen.add(new Person("Carol", "Danvers", LocalDate.of(1996, 6,1)));
        personen.add(new Person("Bruce", "Banner", LocalDate.of(1978, 11,22)));
        personen.add(new Person("Natasha", "Romanov", LocalDate.of(2000, 1,5)));

        try {
            //writeToJson(personen);

            for(Person p : readFromJson()) {
                System.out.println(p.getVorname() + " " + p.getNachname());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeToJson(List<Person> personen) throws IOException {
        mapper.writeValue(new FileWriter(FILE), personen);
    }

    public static List<Person> readFromJson() throws IOException {

        // Person p = mapper.readValue(new FileReader(FILE), Person.class);
        // System.out.println(p);

        CollectionType type = mapper.getTypeFactory().constructCollectionType(List.class, Person.class);
        List<Person> personen = mapper.readValue(new FileReader(FILE), type);
        return personen;
    }
}
