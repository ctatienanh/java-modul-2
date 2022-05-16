package circle;

public class Circle {
    private double radius;
    private double colour;

    public Circle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(double colour) {
        this.colour = colour;
    }
    public double area(double radius){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }

    public String tostring(double radius){
        return "hinh trong co radius" + radius + " area = " + area(radius);
    }
}
