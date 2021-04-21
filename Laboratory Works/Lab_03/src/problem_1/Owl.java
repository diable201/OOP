package problem_1;

public class Owl extends Bird implements Flyable {
    public Owl() {
        super();
    }

    public Owl(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void voice() {
        System.out.println("Voice of owl");
    }

    @Override
    public void fly() {
        System.out.println("Owl can fly");
    }

    @Override
    public void move() {
        System.out.println("Owl can walk");
    }

    @Override
    public String toString() {
        return super.toString() + " Class Owl";
    }
}
