public class Ship {
    public int x; //head_x
    public int y; //head_y
    public int length; //size
    public boolean orientation; //false - vertical, true - horizontal

    Ship(int x, int y, int length, boolean orientation){
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.length = length;
    }
}
