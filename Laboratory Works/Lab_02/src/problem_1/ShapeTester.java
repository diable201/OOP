package problem_1;
import java.util.Vector;

public class ShapeTester {
    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<Shape>();
        Cube cube = new Cube(true, 3);
        Cylinder cylinder = new Cylinder(false, 2, 4);
        Sphere sphere = new Sphere(true, 5);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(sphere);
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
