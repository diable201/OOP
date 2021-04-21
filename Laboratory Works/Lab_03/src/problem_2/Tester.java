package problem_2;

public class Tester {
    public static void main(String[] args) {
        Car car = new Car(60.0);
        car.move();
        Plane plane = new Plane(250.0, 938.4);
        plane.move();
        plane.fly();
    }
}
