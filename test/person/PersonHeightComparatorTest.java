package person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonHeightComparatorTest {


    @Test
    void shouldComparePersonByHeight() {

       PersonHeightComparator personHeightComparator = new PersonHeightComparator();

        Person p1 = new Person(59, "Meier", "Horst", 1.85, 82.3);
        Person p2 = new Person(21, "Welden", "Irene", 1.55, 48.0);

        int actual = personHeightComparator.compare(p1,p2);
        int expected = 1;

        assertEquals(expected, actual);
    }
}