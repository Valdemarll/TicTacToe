package TicTacToe;

import java.util.Locale;
import java.util.Scanner;

public class TicTac {
    String[][] gameField;
    String[] figures = {"x", "o"};
    String order = figures[0];

    TicTac(String[][] gameField) {
        this.gameField = gameField;
    }

    public boolean step(int xy) {
        System.out.println("В какую строчку и столбец установить фигуру (например 13, где 1 - строка, а 3 - столбец)");
        try {
            new Mechanic().addFigure(this.gameField, (xy / 10), (xy % 10), this.order);
            return true;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы неправильно ввели данные");
            return false;
        }
    }
    public int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public boolean checkEnd(){
        if (new Mechanic().setWinner(this.gameField) == null){
            int index = new Mechanic().elementIndex(this.figures, this.order);
            this.order = this.figures[(index + 1)%2];
            return false;
        }else{
            System.out.println("Победил: " + this.order.toUpperCase(Locale.ROOT));
            return true;
        }
    }
    public String printOrder(){
        return "\nОчередь фигуры: " + this.order.toUpperCase(Locale.ROOT);
    }

    public String toString(){
        String res = "======================\n";
        for (int i = 0; i < this.gameField.length; i++){
            res += "[";
            for (String el : this.gameField[i]){
                res += el + "|";
            }
            res = res.substring(0, res.length() - 1);
            res += "]\n";
        }
        res += "======================";
        return res;
    }
}
