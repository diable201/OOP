package problem_1;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder() {
        super();
    }

    public Cylinder(boolean filled, double radius, double height) {
        super(filled);
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return super.toString() + " For Cylinder";
    }
}
