package Task3;

public class Rectangle extends Figure{
    Rectangle(Coordinate coord) {
        super(coord);
    }

    @Override
    public String draw(){
        return "Rectangle";
    }
}
