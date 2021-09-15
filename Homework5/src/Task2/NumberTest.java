package Task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void setNum() {
        Number number = new Number(23);
        number.setNum(12);
        assertEquals(12, number.getNum());
    }

    @Test
    public void getNum() {
        Number number = new Number(23);
        assertEquals(23, number.getNum());
    }
}