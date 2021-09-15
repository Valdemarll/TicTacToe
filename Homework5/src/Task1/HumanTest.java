package Task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {
    @Test
    public void compareTest(){
        Human human1 = new Human(17, "Vasiliy", "russian");
        Human human2 = new Human(28, "Mike", "american");

        Animal animal = new Animal(3, "cat");


        assertEquals(true, human1.compare(human1));
        assertEquals(false, human1.compare(human2));
        assertEquals(false, human1.compare(animal));
    }

}