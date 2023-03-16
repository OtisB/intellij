package person;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person testPerson1 = new Person(38, "Schotte", "Heiko", 1.78, 80.3);
    Person testPerson2 = new Person(38, "Schotte", "Heiko", 1.78, 80.3);
    Person testPerson3 = new Person(88, "Schulz", "Horst", 1.68, 75.5);

    @Test
    void personIsEqual() {
        assertEquals(testPerson1, testPerson2);
    }
    @Test
    void personIsNotEqual() {
        assertNotEquals(testPerson1, testPerson3);
    }

    @Test
    void testHashMap() {
        Map<Person, Integer> testPersonMap = new HashMap<>();

        testPersonMap.put(testPerson1, 1);
        testPersonMap.put(testPerson2, 2);

        assertEquals(2, testPersonMap.get(testPerson2));

    }
}