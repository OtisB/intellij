package leastCommonMultiple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LeastCommonMultipleTest {

    @Test
    public void isLeastCommonMultiple(){
        int firstInt = 7;
        int secondInt = 12;
        int expectedLCM = 84;

        int calculatedLCM = LeastCommonMultiple.calculateLeastCommonMultiple(firstInt, secondInt);

        assertEquals(expectedLCM, calculatedLCM);
    }

    @Test
    public void isNotLeastCommonMultiple(){
        int firstInt = 7;
        int secondInt = 12;
        int expectedLCM = 80;

        int calculatedLCM = LeastCommonMultiple.calculateLeastCommonMultiple(firstInt, secondInt);

        assertNotEquals(expectedLCM, calculatedLCM);
    }
}