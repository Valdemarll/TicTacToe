package Task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calc() {
        Calculator calculator = new Calculator();
        assertEquals(16, calculator.calc(9, 7, new AddCalc()));
        assertEquals(4, calculator.calc(15, 11, new SubCalc()));
        assertEquals(45, calculator.calc(9, 5, new MultiplyCalc()));
        assertEquals(4, calculator.calc(64, 16, new DivCalc()));
    }
}