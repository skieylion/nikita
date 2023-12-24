public class Rectangle {
    int width;
    int height;
    double diagonal;
    double angle;

    Rectangle(double diagonal, double angle) {

        this.diagonal = diagonal;
        this.angle = angle;
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static int area(int width, int height) {
        return width * height;
    }

    public static double area(double diagonal, double angle){
        return (0.5 * diagonal * diagonal * Math.sin(Math.toRadians(angle)));
    }

}
