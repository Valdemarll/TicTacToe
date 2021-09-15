package Task3;

public class Drawer {
    public static String draw(Figure figure1, Figure figure2, Figure figure3){
        String res = "";
        Figure[] figures = {figure1, figure2, figure3};
        for (Figure figure : figures){
            if (figure.draw() != null){
                res += figure.draw();
            }
        }
        return res;
    }
}
