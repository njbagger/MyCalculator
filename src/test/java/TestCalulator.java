import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalulator {
    Calculator calculator;
    @Before
    public void beforeEachTestMethod() {
        calculator = new Calculator();
    }
    @Test
    public void testAdd() {
        assertEquals(9.0, calculator.add(4, 5),0);
    }

    @Test
    public void testSubtract() {
        assertEquals(3, calculator.subtract(5, 2), 0);
    }

    @Test
    public void testMultiply() {
        assertEquals(20, calculator.multiply(5, 4), 0);
    }

    @Test
    public void testDivision() {
        assertEquals(2.5, calculator.divide(5, 2), 0);
        assertEquals(Double.NaN, calculator.divide(5, 0), 0);
    }
}
