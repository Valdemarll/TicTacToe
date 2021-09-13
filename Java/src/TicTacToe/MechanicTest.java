package TicTacToe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MechanicTest {
    @Test
    public void addFigureTest(){
        String[][] array1 = new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        String[][] array2 = new String[][]{{"x", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        assertEquals(array2, new Mechanic().addFigure(array1, 1, 1, "x"));
    }
    @Test
    public void setWinnerTest(){
        Mechanic mechanic = new Mechanic();
        assertEquals(new String[][]{{"X", "X", "X"}, {" ", " ", " "}, {" ", " ", " "}},
                mechanic.setWinner(new String[][]{{"x", "x", "x"}, {" ", " ", " "}, {" ", " ", " "}}));
        assertEquals(new String[][]{{"X", " ", " "}, {"X", " ", " "}, {"X", " ", " "}},
                mechanic.setWinner(new String[][]{{"x", " ", " "}, {"x", " ", " "}, {"x", " ", " "}}));
        assertEquals(new String[][]{{"X", " ", " "}, {" ", "X", " "}, {" ", " ", "X"}},
                mechanic.setWinner(new String[][]{{"x", " ", " "}, {" ", "x", " "}, {" ", " ", "x"}}));
        assertEquals(new String[][]{{" ", " ", "X"}, {" ", "X", " "}, {"X", " ", " "}},
                mechanic.setWinner(new String[][]{{" ", " ", "x"}, {" ", "x", " "}, {"x", " ", " "}}));
    }
    @Test
    public void elementIndexTest(){
        String[] array = {"a", "b", "c", "d"};
        assertEquals(2, new Mechanic().elementIndex(array, "c"));
    }

}
