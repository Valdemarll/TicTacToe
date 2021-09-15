package Task1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void compareTest(){
        Animal animal1 = new Animal(3, "cat");
        Animal animal2 = new Animal(4, "cat");
        Human human = new Human(17, "Vasiliy", "russian");
        assertEquals(true, animal1.compare(animal1));
        assertEquals(false, animal1.compare(animal2));
        assertEquals(false, animal1.compare(human));
    }


}