package Task3;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ZooTest {
    @Test
    public void testZoo() {
        Animal[] animals = {new Monkey(), new Lion(), new Penguin(), new Elephant(), new Zebra()};
        Zoo zoo = new Zoo(animals);

        assertEquals("Monkey\nLion\nPenguin\nElephant\nZebra\n", zoo.printAnimals());
        assertEquals("Monkey\nElephant\nZebra\n", zoo.printHerbivoreAnimals());
        assertEquals("Monkey\nLion\nPenguin\n", zoo.printFleshEatingAnimals());
    }
}