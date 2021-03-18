package problem_1;

public class Cube extends Shape {
    public double side;

    public Cube() {
        super();
    }

    public Cube(boolean filled, double side) {
        super(filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " For Cube";
    }
}
