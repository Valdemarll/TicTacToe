package Task3;

public abstract class Figure {
    int x;
    int y;
    Figure(Coordinate coord){
        this.x = coord.x;
        this.y = coord.y;
    }
    public abstract String draw();
}
a