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
        assertEquals(new ArrayWrapper(3).getArraySize(), 3);
        assertEquals(new ArrayWrapper(7).getArraySize(), 7);
        assertEquals(new ArrayWrapper(8).getArraySize(), 8);
    }

    @Test
    public void add() {
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);

        assertEquals(testArray.get(0), 1);
        assertEquals(testArray.get(1), 2);
        assertEquals(testArray.get(2), 3);
    }

    @Test
   public void testArraySize() {
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
        testArray.add(4);
        testArray.add(5);


        assertEquals(testArray.getArraySize(), 8);
    }


    @Test
    public void getElementCount() {
        testArray.add(1);
        testArray.add(2);
        assertEquals(testArray.getElementCount(), 2);
    }
}