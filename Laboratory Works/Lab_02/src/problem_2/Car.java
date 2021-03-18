package problem_2;
import java.util.Objects;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car() {
        super();
    }

    public Car(String model, int year, int numberOfDoors) {
        super(model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int setNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String sound() {
        return "My sound: VRVRVR";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return (numberOfDoors == car.numberOfDoors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getModel(), super.getYear(), numberOfDoors);
    }

    @Override
    public String toString() {
        return super.toString() + " Number of doors: " + getNumberOfDoors();
    }
}
