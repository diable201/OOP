package problem_2;

public class Car implements Movable {
    private double speed;

    public Car() {}

    public Car(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car {" +
                "speed = " + speed +
                '}';
    }

    @Override
    public void move() {
        System.out.println("The speed of car = " + speed + " km/ph");
    }
}
