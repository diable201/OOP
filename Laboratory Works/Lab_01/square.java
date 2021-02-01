import java.util.*;

public class PrintName {

    public static void main(String []args) {
        System.out.println("Enter side: ");
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        System.out.println("Area = " + side * side);
        System.out.println("Perimeter = " + 4 * side);
        System.out.println("Diagonal = " + Math.sqrt(2) * side);
    }
}
