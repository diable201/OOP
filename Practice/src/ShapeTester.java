import java.util.Vector;

public class ShapeTester {

    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<Shape>();
        shapes.add(new Square(Shape.Color.RED, 1, 2, Math.sqrt(2) * 2));
        shapes.add(new Triangle(Shape.Color.BLACK, 2));
        shapes.add(new Circle(Shape.Color.RED, 2, 2));
    
        for (Shape shape : shapes) {
            shape.draw();
        }

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Square s = (Square)shape;
                s.draw(2);
            }
            else if (shape instanceof Circle) {
                Circle c = (Circle)shape;
                c.draw(2);
            }
            else if (shape instanceof Triangle) {
                Triangle t = (Triangle)shape;
                t.draw(3);
            }
        }
    }
}
