package bodyMassCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassCalculatorTest {
    @Test
    public void whenBMIIsGreaterThanThirty_thenObese() {
        BmiClassification actual = BodyMassCalculator.classifyBMI(50);
        BmiClassification expected = BmiClassification.OBESE;

        assertEquals(expected, actual);
    }

    @Test
    public void whenBMIIsGreaterThanTwentyFife_thenOverweight() {
        BmiClassification actual = BodyMassCalculator.classifyBMI(28);
        BmiClassification expected = BmiClassification.OVERWEIGHT;

        assertEquals(expected, actual);
    }

    @Test
    public void whenBMIIsGreaterThanTwentyFife_thenNormal() {
        BmiClassification actual = BodyMassCalculator.classifyBMI(22);
        BmiClassification expected = BmiClassification.NORMAL;

        assertEquals(expected, actual);
    }

    @Test
    public void whenBMIIsGreaterThanTwentyFife_thenUnderweight() {
        BmiClassification actual = BodyMassCalculator.classifyBMI(14);
        BmiClassification expected = BmiClassification.UNDERWEIGHT;

        assertEquals(expected, actual);
    }



    //ToDo Test for calculate

}