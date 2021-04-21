package problem_2;

public class Plane implements Flyable {
    private double takeoffSpeed;
    private double cruisingSpeed;

    public Plane() {}

    public Plane(double takeoffSpeed, double cruisingSpeed) {
        this.takeoffSpeed = takeoffSpeed;
        this.cruisingSpeed = cruisingSpeed;
    }

    public double getTakeoffSpeed() {
        return takeoffSpeed;
    }

    public void setTakeoffSpeed(double takeoffSpeed) {
        this.takeoffSpeed = takeoffSpeed;
    }

    public double getCruisingSpeed() {
        return cruisingSpeed;
    }

    public void setCruisingSpeed(double cruisingSpeed) {
        this.cruisingSpeed = cruisingSpeed;
    }

    @Override
    public String toString() {
        return "Plane {" +
                "takeoffSpeed = " + takeoffSpeed +
                ", cruisingSpeed = " + cruisingSpeed +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("The cruising speed of plane = " + cruisingSpeed + " km/ph");
    }

    @Override
    public void move() {
        System.out.println("The takeoff speed of plane = " + takeoffSpeed + " km/ph");
    }
}
