package Task3;

public class Round extends Figure{
    Round(Coordinate coord) {
        super(coord);
    }

    @Override
    public String draw() {
        return "Round";
    }
}
