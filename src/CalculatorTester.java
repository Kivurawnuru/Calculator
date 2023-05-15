import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTester {

    @Test
    void addingNumberShouldWork(){
        assertEquals(7,Calculator.add(5,2));
    }

    @Test
    void addingTwoSameOppositeNumbersShouldReturnZero(){
        assertEquals(0,Calculator.add(5,-5));
    }

    @Test
    void dividingTwoDifferentNumbersShouldWork(){
        assertEquals(5,Calculator.divide(10,2));
    }

    @Test
    void dividingWithZeroShouldntWork(){
        Throwable exception = assertThrows(java.lang.ArithmeticException.class, () -> Calculator.divide(5,0));
        assertEquals("/ by zero",exception.getMessage());
    }
    @Test
    void substractingShouldWork(){
        assertEquals(3,Calculator.sub(5,2));
    }

    @Test
    void multiplicatingTwoDiffetentNumbers(){
        assertEquals(10,Calculator.multiplication(5,2));
    }
}
