package TicTacToe;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacTest {
    @Test
    public void stepTest(){
        assertTrue(new TicTac(new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}}).step(12));
        assertFalse(new TicTac(new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}}).step(51));
    }
    @Test
    public void checkEndTest(){
        assertTrue(new TicTac(new String[][]{{"X", "X", "X"}, {" ", " ", " "}, {" ", " ", " "}}).checkEnd());
        assertFalse(new TicTac(new String[][]{{"x", "x", "o"}, {" ", " ", " "}, {" ", " ", " "}}).checkEnd());
    }
    @Test
    public void toStringTest(){
        assertEquals("\nОчередь фигуры: X",
                new TicTac(new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}}).printOrder());
        assertEquals("======================\n[ | | ]\n[ | | ]\n[ | | ]\n======================",
                new TicTac(new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}}).toString());
    }

}