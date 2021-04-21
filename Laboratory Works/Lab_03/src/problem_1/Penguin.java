package problem_1;

public class Penguin extends Bird implements Swimmable {

    public Penguin() {
        super();
    }

    public Penguin(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void voice() {
        System.out.println("Voice of penguins");
    }

    @Override
    public String toString() {
        return super.toString() + " Class Penguin";
    }

    @Override
    public void move() {
        System.out.println("Penguin can walk");
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }
}
