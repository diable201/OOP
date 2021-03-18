package problem_1;

public abstract class Shape {
    private boolean filled;

    public Shape() {}

    public Shape(boolean filled) {
        this.filled = filled;
    }

    public abstract double volume();

    public abstract double surfaceArea();

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Volume: " + volume() + " Surface Area: " + surfaceArea() + (getFilled() ? " Filled" : " Not Filled");
    }
}
