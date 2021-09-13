package TicTacToe;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TicTac ticTac = new TicTac(new String[][]{{"x", "x", " "}, {" ", " ", " "}, {" ", " ", " "}});
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println(ticTac.printOrder());
            System.out.println(ticTac);
            if (ticTac.step(ticTac.input())){
                if (ticTac.checkEnd()) {
                    System.out.println(ticTac);
                    System.out.println("Продолжить игру?");
                    String end = scanner.nextLine();
                    if (Objects.equals(end, "Нет")) {
                        break;
                    } else {
                        ticTac = new TicTac(new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}});
                    }
                }
            }
        }

    }
}
