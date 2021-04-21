package problem_1;

public class Tester {
    public static void main(String[] args) {
        Rocket rocket = new Rocket(250);
        Duck duck = new Duck();
        Penguin penguin = new Penguin();
        Owl owl = new Owl();
        owl.fly();
        duck.fly();
        duck.swim();
        rocket.fly();
        penguin.move();
        owl.move();
        System.out.println(rocket);
        System.out.println(duck);
        System.out.println(penguin);
        System.out.println(owl);
    }
}
