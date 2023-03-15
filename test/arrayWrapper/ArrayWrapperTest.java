package arrayWrapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayWrapperTest {

    @Test
    public void shouldAddElement() {
        ArrayWrapper arrayWrapper = new ArrayWrapper<>(3);

        arrayWrapper.add(1);
        arrayWrapper.add(2);
        arrayWrapper.add(3);

        int expectedFirstElement = 1;
        int expectedSecondElement = 2;
        int expectedThirdElement = 3;

        int firstElement = arrayWrapper.get(0);
        int secondElement = arrayWrapper.get(1);
        int thirdElement = arrayWrapper.get(2);

        assertEquals(expectedFirstElement, firstElement);
        assertEquals(expectedSecondElement, secondElement);
        assertEquals(expectedThirdElement, thirdElement);
    }


    @Test
    public void testArraySizeDoubling() {
        ArrayWrapper arrayWrapper = new ArrayWrapper<>(3);

        arrayWrapper.add(1);
        arrayWrapper.add(2);
        arrayWrapper.add(3);
        arrayWrapper.add(4);

        int expectedArraySize = 6;
        int arraySize = arrayWrapper.getArraySize();

        assertEquals(expectedArraySize, arraySize);
    }


    @Test
    public void shouldGetCorrectElementCount() {
        ArrayWrapper arrayWrapper = new ArrayWrapper<>(3);

        arrayWrapper.add(1);
        arrayWrapper.add(2);
        arrayWrapper.add(3);

        int expectedElementCount = 3;
        int elementCount = arrayWrapper.getElementCount();

        assertEquals(expectedElementCount, elementCount);
    }
}