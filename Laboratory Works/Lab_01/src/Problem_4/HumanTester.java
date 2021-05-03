package Problem_4;

public class HumanTester {
    public static void main(String[] args) {
        Human h = new Human();
        h.setAge(20);;
        h.setGender("Male");
        h.setName("Dauren");
        h.setMonthOfBirthday(Months.JUNE);
        System.out.println(h);
        System.out.println("Home Planet: " + Human.getHomePlanet());
    }
}
