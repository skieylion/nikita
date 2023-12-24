public class Parallelogram {
    double side1;
    double side2;
    double height;
    double angle;

    Parallelogram(double side1, double height) {
        this.side1 = side1;
        this.height = height;
    }

    Parallelogram(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    public static double area(double side1,double side2, double angle){
        return (side1 * side2 * Math.sin(Math.toRadians(angle)));
    }
    public static double area(double side1, double height){
        return (side1 * height);
    }



}
