import copyingObjects.ObjectCopier;
import person.Person;
import person.PersonAgeComparator;

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Field[] personFields = Person.class.getDeclaredFields();

        /*
        for(Field f : personFields) {
            System.out.println(f.getName());
            System.out.println(f.getType());
            System.out.println(f.hashCode());
        }
*/
        Method[] personMethods = Person.class.getDeclaredMethods();

        for (Method m : personMethods) {
            System.out.println(m.getName());
            System.out.println(m.getReturnType());
        }
    }
}