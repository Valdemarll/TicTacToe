package Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class DrawerTest {

    @Test
    public void draw() {
        Drawer drawer = new Drawer();
        Coordinate cord = new Coordinate(2, 3);
        assertEquals("RectangleRoundTriangle", Drawer.draw(new Rectangle(cord), new Round(cord), new Triangle(cord)));
    }
}