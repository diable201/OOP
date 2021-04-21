package problem_5;

public class Tester {
    public static void main(String[] args) {
        Chocolate[] chocolates = new Chocolate[5];
        chocolates[0] = new Chocolate(150, "Twix");
        chocolates[1] = new Chocolate(120, "Snickers");
        chocolates[2] = new Chocolate(160, "Mars");
        chocolates[3] = new Chocolate(100, "KitKat");
        chocolates[4] = new Chocolate(200, "Merci");

        Sort.bubbleSort(chocolates);
//        Sort.quickSort(chocolates);

        for (Chocolate chocolate: chocolates)
            System.out.println(chocolate);

        Time[] times = new Time[3];
        times[0] = new Time(10, 5, 30);
        times[1] = new Time(14, 45, 10);
        times[2] = new Time(10, 32, 40);

//        Sort.bubbleSort(times);
        Sort.quickSort(times);

        for (Time time: times)
            System.out.println(time);
    }
}
