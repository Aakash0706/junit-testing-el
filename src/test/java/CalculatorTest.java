import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calc.add(5,5));
    }

    @Test
    void testSubtraction() {
        assertEquals(3, calc.subtract(8,5));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, calc.multiply(4,5));
    }
}
