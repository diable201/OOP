package problem_2;
import java.util.HashSet;

public class VehicleTester {
    public static void main(String[] args) {
        HashSet<Vehicle> vehicles = new HashSet<>();
        vehicles.add(new Vehicle("Boing", 2005));
        vehicles.add(new Vehicle("Boing", 2005));
        vehicles.add(new Car("Subaru", 2017, 4));
        vehicles.add(new Car("Subaru", 2017, 4));
        System.out.println(vehicles);
    }
}
