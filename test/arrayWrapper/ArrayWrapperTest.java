package arrayWrapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWrapperTest {

    private ArrayWrapper testArray;

    @BeforeEach
    public void initArray() {
        testArray = new ArrayWrapper(3);
        testArray.add(1);
        testArray.add(2);
    }

    @Test
    void getArraySize() {
        assertEquals(testArray.getArraySize(), 3);
    }

    @Test
    void add() {
        testArray.add(3);
        System.out.println(testArray.getArraySize());
        testArray.add(4);
        System.out.println("New element added. Array size increase");
        System.out.println(testArray.getArraySize());
    }

    @Test
    void get() {
        assertEquals(testArray.get(1), 2);
    }

    @Test
    void getElementCount() {
        assertEquals(testArray.getElementCount(), 2);
    }
}