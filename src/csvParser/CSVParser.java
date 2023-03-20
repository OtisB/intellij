package csvParser;

import person.Person;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVParser {

    private static final String SEPARATOR = ",";
    private static final String NEW_LINE = "\n";


    /**
     * Checks if an object is parsable by checking if the @CSFEntity annotation is present at the class of object
     * @param obj the object to check
     * @return If the object is parseable to csv string
     */
    public boolean isParsable(Object obj) {
        return obj.getClass().getAnnotation(CSVEntity.class) != null;
    }

    /**
     * Gets all fields for the csv export which are annotated with @CSVField
     * @param obj The object to extract all fields
     * @return All fields which are necessary for a csv export
     */
    public List<Field> getFields(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        List<Field> csvFields = new ArrayList<>();

        for (Field f : fields) {
            if (f.getAnnotation(CSVEntity.class) != null) {
                csvFields.add(f);
            }
        }
        return csvFields;
    }

    /**
     * Parse a collection of java objects to a csv file
     * @param persons The persons to write to the csv file
     * @return The csv string
     */
    public String parse(List<Person> persons) {

        if (persons.isEmpty()) return "";

        StringBuilder csv = new StringBuilder();
        csv.append(generateCSVHeader(persons.get(0)));
        csv.append(generateCSVContent(persons));

        return csv.toString();
    }

    /**
     * Generate the csv header for the provided object
     * @param person The object to extract the header
     * @return The header in csv format
     */
    public String generateCSVHeader(Person person) {

        StringBuilder header = new StringBuilder();

        List<Field> fields = this.getFields(person);

        for (int i = 0; i < fields.size(); i++) {
            header.append(fields.get(i).getName()); //add attribute name
            if (i != fields.size() - 1) {   // if not last attribute add separator
                header.append(SEPARATOR);
            } else {    // if last attribute add new line
                header.append(NEW_LINE);
            }
        }
        return header.toString();
    }

    /**
     * Generate the csv content for the provided object
     * @param persons The object to extract the content
     * @return The content in csv format
     */
    public String generateCSVContent(List<Person> persons) {
        StringBuilder csvContent = new StringBuilder();
        try {
            for (Person person : persons) {
                List<Field> fields = this.getFields(person);
                for (int i = 0; i < fields.size(); i++) {
                    csvContent.append(fields.get(i).get(person));
                    if (i != fields.size() - 1) {   // if not last attribute add separator
                        csvContent.append(SEPARATOR);
                    } else {    // if last attribute add new line
                        csvContent.append(NEW_LINE);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Could not access value");
        }
        return csvContent.toString();
    }
}