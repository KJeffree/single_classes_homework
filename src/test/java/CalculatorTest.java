import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(11, calculator.add(5, 6), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtract(7, 3), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(28, calculator.multiply(4, 7), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(5, calculator.divide(15, 3), 0.01);
    }




}
