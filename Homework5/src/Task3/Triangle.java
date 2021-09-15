package Task3;

public class Triangle extends Figure{
    Triangle(Coordinate coord) {
        super(coord);
    }

    @Override
    public String draw() {
        return "Triangle";
    }
}
