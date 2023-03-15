package copyingObjects;

import person.Person;

import java.util.*;

public class ObjectCopier {

    /**
     * Creates a List of shallow copies of a Person object
     * @param person object which will be copied
     * @param numberOfCopies defines how many shallow copies are made to fill the List with
     * @return a List of shallow copies of a Person object
     */
    public static List<Person> shallowCopy(Person person, Integer numberOfCopies ) {

        List<Person> shallowCopies = new ArrayList<>();

        for (int i = 1; i <= numberOfCopies; i++) {
            Person copy = person;
            shallowCopies.add(copy);
        }

        return shallowCopies;
    }

    /**
     * Creates a List of shallow copies of a generic object
     * @param o object which will be copied
     * @param numberOfCopies defines how many shallow copies are made to fill the List with
     * @return a List of shallow copies of a Person object
     * @param <T> generic type which is excepted
     */
    //static <T> <T> is here only needed because method is static
    public static <T> List<T> genericShallowCopy(T o, Integer numberOfCopies ) {

        List<T> shallowCopies = new ArrayList<>();

        for (int i = 1; i <= numberOfCopies; i++) {
            T copy = o;
            shallowCopies.add(copy);
        }

        return shallowCopies;
    }

}
