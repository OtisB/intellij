
import csvParser.CSVParser;
import person.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Person person1 = new Person(38, "Schotte", "Heiko", 1.78, 80.3);
        Person person2 = new Person(38, "Schotte", "Heiko", 1.78, 80.3);
        Person person3 = new Person(88, "Schulz", "Horst", 1.68, 75.5);

        List<Person> persons = new ArrayList<>(Arrays.asList(person1, person2, person3));

        String csv = new CSVParser().parse(persons);

        System.out.println(csv);

    }
}