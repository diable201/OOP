package Problem_1;
import java.util.Scanner;

public class Analyzer {
	
    public static void main(String[] args) {
        Data data = new Data();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter number (Q) to quit: ");
            String symbol = scanner.next();

            if(symbol.equals("Q")){
                System.out.println("Average = " + data.getAverage());
                System.out.println("Maximum = " + data.getMax());
                scanner.close();
                break;
            }
            double number = Double.parseDouble(symbol);
            data.addValue(number);
        }
    }
}