public class Circle extends Shape {
    int radius;
    
    public Circle() {
        super();
    }
    
    public Circle(Color color, int x, int radius) {
        super(color, x);
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        for (int i = 0; i < x; i++)
            System.out.print(" ");
        if (color == Color.RED)
            System.err.print("()");
        else 
            System.out.print("()");
    }
    
    public void draw(int number) {
        for (int i = 0; i < number; i++) {
            if (color == Color.BLACK)
                System.out.print("()");
            else
                System.err.print("()");
        }
    }
}

