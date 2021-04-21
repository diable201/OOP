package problem_1;

public class Duck extends Bird implements Swimmable, Flyable {

    public Duck() {
        super();
    }

    public Duck(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void voice() {
        System.out.println("Voice of duck");
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void move() {
        System.out.println("Duck can walk");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }

    @Override
    public String toString() {
        return super.toString() + " Class Duck";
    }
}
