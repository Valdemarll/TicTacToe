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

    public boolean step() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("В какую строчку и столбец установить фигуру");
        int xy = scanner.nextInt();

        return new Mechanic().addFigure(this.gameField, (xy/10), (xy%10), this.order);
    }

    public boolean checkEnd(){
        if (new Mechanic().setWinner(this.gameField) == null){
            int index = new Mechanic().elementIndex(this.figures, this.order);
            System.out.println(index);
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
