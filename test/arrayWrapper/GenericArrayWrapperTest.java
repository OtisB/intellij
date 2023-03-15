package arrayWrapper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GenericArrayWrapperTest {

    @Test
    public void ShouldAddElement() {
        GenericArrayWrapper<String> genericArrayWrapper = new GenericArrayWrapper<>(3);

        genericArrayWrapper.add("Hello");
        genericArrayWrapper.add("there");
        genericArrayWrapper.add("General Kenobi");

        String expectedFirstElement = "Hello";
        String expectedSecondElement = "there";
        String expectedThirdElement = "General Kenobi";

        String firstElement = genericArrayWrapper.get(0);
        String secondElement = genericArrayWrapper.get(1);
        String thirdElement = genericArrayWrapper.get(2);

        assertEquals(expectedFirstElement, firstElement);
        assertEquals(expectedSecondElement, secondElement);
        assertEquals(expectedThirdElement, thirdElement);
    }

    @Test
    public void shouldDoubleArraySize () {
        GenericArrayWrapper<String> genericArrayWrapper = new GenericArrayWrapper<>(3);

        genericArrayWrapper.add("Hello");
        genericArrayWrapper.add("there");
        genericArrayWrapper.add("General Kenobi");
        genericArrayWrapper.add("!");

        int expectedArraySize = 6;
        int arraySize = genericArrayWrapper.getArraySize();

        assertEquals(expectedArraySize, arraySize);
    }

    @Test
    public void shouldGetCorrectElementCount() {
        GenericArrayWrapper<String> genericArrayWrapper = new GenericArrayWrapper<>(3);

        genericArrayWrapper.add("Hello");
        genericArrayWrapper.add("there");
        genericArrayWrapper.add("General Kenobi");

        int expectedElementCount = 3;
        int elementCount = genericArrayWrapper.getElementCount();

        assertEquals(expectedElementCount, elementCount);
    }
}