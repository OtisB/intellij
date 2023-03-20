package streams;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal cat = new Animal("Cat", 2, 4.2, 4);
    Animal dog = new Animal("Dog", 5, 36.0, 4);
    Animal elephant = new Animal("Elephant", 25, 2000.0, 4);
    Animal bird = new Animal("bird", 1, 0.5, 2);
    Animal spider = new Animal("Spider", 1, 0.1, 8);
    Animal ape = new Animal("Ape", 7, 25.0, 2);


    private final List<Animal> animalList = new ArrayList<>(Arrays.asList(cat, dog,elephant,bird,spider,ape));

    @Test
    void filterTwoLegs() {
      assertEquals(List.of(bird, ape), Animal.filterTwoLegs(animalList));
    }

    @Test
    void filterAgeOverTen() {
        assertEquals(List.of(elephant), Animal.filterAgeOverTen(animalList));
    }

    @Test
    void filterAgeBetweenFiveAndEight() {
        assertEquals(List.of(ape), Animal.filterAgeBetweenFiveAndEight(animalList));
    }

    @Test
    void filterWeightOver30AndYoungerThan20() {
        assertEquals(List.of(dog), Animal.filterWeightOver30AndYoungerThan20(animalList));
    }

    @Test
    void filterWithFourLegsAndOddAge() {
        assertEquals(List.of(dog, elephant), Animal.filterWithFourLegsAndOddAge(animalList));
    }
}