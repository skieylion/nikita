//создайте класс  ImmutablePoint с final полями x и y
public class ImmutablePoint {
    final int x;
    final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
}
