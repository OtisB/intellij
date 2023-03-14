package person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person testPerson1 = new Person(38, "Schotte", "Heiko", 1.78, 80.3);
    Person testPerson2 = new Person(88, "Schulz", "Horst", 1.68, 75.5);

    @Test
    void personIsEqual() {
        assertEquals(testPerson1, testPerson1);
    }
    @Test
    void personIsNotEqual() {
        assertEquals(testPerson1, testPerson2);
    }
}