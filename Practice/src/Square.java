public class Square extends Shape {
	private double diagonal;
	
	public Square() {
		super();
	}
	
	public Square(Color color, int x, double diagonal) {
		super(color, x);
		this.diagonal = diagonal;
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
	
	public void draw(int number) {
		for (int i = 0; i < number; i++) {
			if (color == Color.BLACK)
				System.out.print("[]");
			else
				System.err.print("[]");
		}
	}
}
