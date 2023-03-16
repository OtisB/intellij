package person;

import java.util.Comparator;

public class PersonHeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getHeight() < o2.getHeight()) {
            return -1;
        } else if (o1.getHeight() > o2.getHeight()) {
            return 1;
        } else {
            return 0;
        }
    }
}
