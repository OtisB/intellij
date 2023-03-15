package arrayWrapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWrapperTest {

    private ArrayWrapper testArray;

    @BeforeEach
    public void initArray() {
        int initialArraySize = 4;
        testArray = new ArrayWrapper(initialArraySize);
    }

    @Test
    public void getArraySize() {
        assertEquals(3, new ArrayWrapper(3).getArraySize());
        assertEquals(7, new ArrayWrapper(7).getArraySize());
        assertEquals(8, new ArrayWrapper(8).getArraySize());
    }

    @Test
    public void add() {
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);

        assertEquals(1, testArray.get(0));
        assertEquals(2, testArray.get(1));
        assertEquals(3, testArray.get(2));
    }


    @Test
   public void testArraySizeGrow() {
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
        testArray.add(4);
        testArray.add(5);

        assertEquals(8, testArray.getArraySize());
    }


    @Test
    public void getElementCount() {
        testArray.add(1);
        testArray.add(2);
        assertEquals(2, testArray.getElementCount());
    }
}