package csvParser;

import org.junit.jupiter.api.Test;
import person.Person;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CSVParserTest {

    private static final String SEPARATOR = ",";
    private static final String NEW_LINE = "\n";

    @CSVEntity
    private class Parseble {
    }

    private class NotParseble {
    }

    @CSVEntity
    private class HasFields {
        @CSVField
        public String lastName;
    }

    @Test
   public void isParsable() {
        assertTrue(new CSVParser().isParsable(new Parseble()));
    }
    @Test
   public void isNotParsable() {
        assertFalse(new CSVParser().isParsable(new NotParseble()));
    }

    @Test
    public void getFields() {
        Field expectedField = HasFields.class.getDeclaredFields()[0];
        Field actualField = new CSVParser().getFields(new HasFields()).get(0);
        assertEquals(expectedField, actualField);
    }

    @Test
    public void parse() {
    }

    @Test
    public void generateCSVHeader() {
       String actualHeader = new CSVParser().generateCSVHeader(new Person());
       String expectedHeader = "lastName" + SEPARATOR + "firstName" + NEW_LINE;

       assertEquals(expectedHeader, actualHeader);
    }

    @Test
    public void generateCSVContent() {
        String expected = """
                Schotte,Heiko
                Schotte,Heiko
                Schulz,Horst""";
    }
}