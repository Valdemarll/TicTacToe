package Task5;

import org.junit.Test;

import static org.junit.Assert.*;

public class Sender2Test {

    @Test
    public void Sender() {
        Sender2 sender2 = new Sender2();
        sender2.send("Я опаздываю");
    }
}