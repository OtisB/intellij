package divisibleByTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleByTwoTest {
    //values to test: 0, 2, 13
    @Test
    public void shouldBeDivisibleByTwo(){
        int two = 2;
        int zero = 0;
        assertTrue(DivisibleByTwo.isDivisibleByTwo(two));
        assertTrue(DivisibleByTwo.isDivisibleByTwo(zero));
    }

    @Test
    public void shouldNotBeDivisibleByTwo(){
        int two = 13;
        int zero = 21;
        assertFalse(DivisibleByTwo.isDivisibleByTwo(two));
        assertFalse(DivisibleByTwo.isDivisibleByTwo(zero));
    }
}