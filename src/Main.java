import copyingObjects.ObjectCopier;
import person.Person;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person HansPeter = new Person(65, "Geerdes", "Hans Peter", 1.86, 82.3);

        //List<Person> shallowCopies = ObjectCopier.shallowCopy(HansPeter, 6);
        //System.out.println(shallowCopies);

        List<Person> genericShallowCopies = ObjectCopier.genericShallowCopy(HansPeter, 6);
        System.out.println(genericShallowCopies);

        genericShallowCopies.get(0).setAge(70);
        System.out.println(genericShallowCopies);
    }
}