package problem_1;

public class Rocket implements Flyable {
    private double speed;

    public Rocket() {}

    public Rocket(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void fly() {
        System.out.println("The rocket is flying with speed: " + speed);
    }

    @Override
    public void move() {
        System.out.println("Start of the moving");
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "speed=" + speed +
                '}';
    }
}
