package Problem_2;
public class TemperatureTester {

    public static void main(String[] args) {
        Temperature t = new Temperature(150, 'F');
        System.out.println(t.toString());
        
        if(t.getScale() == 'C') {
            System.out.print(t.toFahrenheit());
            System.out.print("°F");
        }
        else {
            System.out.print(t.toCelcius());
            System.out.print("°C");
        }
    }
}