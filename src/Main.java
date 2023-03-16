import copyingObjects.ObjectCopier;
import person.Person;
import person.PersonAgeComparator;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(65, "Geerdes", "Hans Peter", 1.86, 82.3);
        Person p2 = new Person(69, "Geerdes", "Hans Peter", 1.86, 82.3);
        Person p3 = new Person(67, "Geerdes", "Hans Peter", 1.86, 82.3);

        List<Person> compareList = new ArrayList<>();
        compareList.add(p1);
        compareList.add(p2);
        compareList.add(p3);

        compareList.sort(new PersonAgeComparator());

        System.out.println(compareList);
    }
}