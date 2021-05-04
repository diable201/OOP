public class Triangle extends Shape {
    
    protected int hyp;
    
    public Triangle() {
        super();
    }
    
    public Triangle(Color color, int x) {
        super(color, x);
    }
    
    @Override
    public void draw() {
        for (int i = 0; i < x; i++)
            System.out.print(" ");
        if (color == Color.RED) 
            System.err.print("/\\");
        else 
            System.out.print("/\\");
    }
    
    public void draw(int number) {
        for (int i = 0; i < number; i++) {
            if (color == Color.BLACK)
                System.out.print("/\\");
            else
                System.err.print("/\\");
        }
    }
    
    public int getHyp() {
        return hyp;
    }
}
