package Task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumWrapperTest {

    @Test
    public void getNum() {
        NumWrapper numWrapper1 = new NumWrapper(new Number(45));
        assertEquals(45, numWrapper1.getNum());
    }
}