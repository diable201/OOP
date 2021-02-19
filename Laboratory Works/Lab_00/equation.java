import java.util.*;

public class Equation {

    public static void main(String []args) {
        System.out.println("Enter variables: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double d = (Math.pow(b, 2) - (4 * a * c));
        double discrSqrt = Math.sqrt(d);
        if (discrSqrt > 0) {
            double x1 = (-b + d)/(2 * a );
            double x2 = (-b - d)/(2 *a);
            String root1 = Double.toString(x1);
            String root2 = Double.toString(x2);
            System.out.println("The two roots are x1 and x2: " + root1 + " and " + root2);
        }
        else if (discrSqrt == 0) {
            double x = (-b)/(2 * a);
            String root = Double.toString(x);
            System.out.println("The equation has one root x: "  + root);
        }
        else
            System.out.println("No Solution in R space");
    }
}
