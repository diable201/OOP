package problem_1;

public class Sphere extends Shape {
    private double radius;

    public Sphere() {
        super();
    }

    public Sphere(boolean filled, double radius) {
        super(filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " For Sphere";
    }
}
