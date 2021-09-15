package Task5;

import org.junit.Test;

import static org.junit.Assert.*;

public class Sender1Test {

    @Test
    public void Sender() {
        Sender1 sender1 = new Sender1();
        sender1.send("Как дела?");
    }
}