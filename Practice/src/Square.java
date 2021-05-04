public class Square extends Shape {
    private double side;
    private double diagonal;
    
    public Square() {
        super();
    }
    
    public Square(Color color, int x, double diagonal, double side) {
        super(color, x);
        this.diagonal = diagonal;
        this.side = side;
    }

    @Override
    public void draw() {
        for (int i = 0; i < x; i++)
            System.out.print(" ");
        if (color == Color.BLACK)
            System.out.print("[]");
        else
            System.err.print("[]");
    }

    public double calculateDiagonal(double side) {
        return Math.sqrt(2) * side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getSide() {
        return side;
    }

    public double getDiagonal() {
        return diagonal;
    }
    
    public void draw(int number) {
        for (int i = 0; i < number; i++) {
            if (color == Color.BLACK)
                System.out.print("[]");
            else
                System.err.print("[]");
        }
    }
}
