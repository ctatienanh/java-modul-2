package circle;

public class Cylinder extends Circle {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(double width, double height) {
        double area = width * height;
        return area;
    }

}
