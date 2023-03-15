package copyingObjects;

import org.junit.jupiter.api.Test;
import person.Person;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ObjectCopierTest {

    @Test
    public void shouldDoGenericShallowCopy() {
        Person objectToCopy = new Person(20, "Mustermann", "Max",1.83, 85.0);

        List<Person> copies = ObjectCopier.genericShallowCopy(objectToCopy, 5);

        Integer expectedAge = 20;
        Integer ageOfFirstCopy  = copies.get(0).getAge();
        assertEquals(expectedAge, ageOfFirstCopy);

        int expectedCopySize = 5;
        int copySize = copies.size();
        assertEquals(expectedCopySize, copySize);

        for (Person copy : copies) {
            assertSame(copy, objectToCopy);
        }
    }
}