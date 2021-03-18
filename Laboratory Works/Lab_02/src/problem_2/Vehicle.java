package problem_2;
import java.util.Objects;

public class Vehicle {
    private String model;
    private int year;

    public Vehicle() {}

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String sound() {
        return "I have not sound";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return (year == vehicle.year) && this.model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    @Override
    public String toString() {
        return "Model: " + getModel() + " Year: " + getYear();
    }
}
