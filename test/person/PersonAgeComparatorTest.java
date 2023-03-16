package person;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonAgeComparatorTest {

    @Test
    void shouldComparePersonByAge() {

        PersonAgeComparator personAgeComparator = new PersonAgeComparator();

        Person p1 = new Person(59, "Meier", "Horst", 1.85, 82.3);
        Person p2 = new Person(21, "Welden", "Irene", 1.55, 48.0);

        int actual = personAgeComparator.compare(p1,p2);
        int expected = 1;

        assertEquals(expected, actual);
    }
}