public class Parallelogram {
    double width;
    double base;
    double height;
    double degree_angle;

    Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    Parallelogram(double base, double width, double degree_angle) {
        this.base = base;
        this.width = width;
        this.degree_angle = degree_angle;
    }

    public double calculateArea_with_angle(){
        return base * width * Math.sin(Math.toRadians(degree_angle));
    }
    public double calculateArea(){
        return (base * height);
    }



}
