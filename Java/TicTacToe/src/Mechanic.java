import java.util.Locale;
import java.util.Objects;

public class Mechanic {

    public String[][] addFigure(String[][] gameField, int x, int y, String figure){
        if (Objects.equals(gameField[x - 1][y - 1], " ")) {
            gameField[x - 1][y - 1] = figure;
        }
        return gameField;
    }

    public String[][] setWinner(String[][] gameField){
        for (int i = 0; i < gameField.length; i++) {
            String[] line1 = gameField[i];
            if (threeInRow(line1)) {

                return toUpper1(gameField, i);
            }
            String[] line2 = {gameField[0][i], gameField[1][i], gameField[2][i]};
            if (threeInRow(line2)) {
                return toUpper2(gameField, i);
            }
        }
        String[] line3 = {gameField[0][0], gameField[1][1], gameField[2][2]};
        if (threeInRow(line3)) {
            return toUpper3(gameField);
        }
        String[] line4 = {gameField[0][2], gameField[1][1], gameField[2][0]};
        if (threeInRow(line4)) {
            return toUpper4(gameField);
        }
        return null;
    }

    public int elementIndex(String[] array, String element){
        for (int i = 0; i < array.length; i++){
            if (Objects.equals(array[i], element)){
                return i;
            }
        }
        return 0;
    }

    private String[][] toUpper1(String[][] array, int index){
        for (int i = 0; i < array[index].length; i++){
            array[index][i] = array[index][i].toUpperCase(Locale.ROOT);
        }
        return array;
    }

    private String[][] toUpper2(String[][] array, int index){
        for (int i = 0; i < array.length; i++){
            array[i][index] = array[i][index].toUpperCase(Locale.ROOT);
        }
        return array;
    }

    private String[][] toUpper3(String[][] array){
        for (int i = 0; i < array.length; i++){
            array[i][i] = array[i][i].toUpperCase(Locale.ROOT);
        }
        return array;
    }

    private String[][] toUpper4(String[][] array){
        for (int i = 0; i < array.length; i++){
            array[i][2 - i] = array[i][2 - i].toUpperCase(Locale.ROOT);
        }
        return array;
    }

    private boolean threeInRow(String[] line){
        int count = 1;
        String toCompare = line[0];
        for (int i = 1; i < line.length; i++){
            if (Objects.equals(line[i], toCompare)){
                count += 1;
            }
        }
        if (!Objects.equals(toCompare, " ")) {
            if (count == line.length) {
                return true;
            }
        }
        return false;
    }
}
