import java.util.*;

public class PrintName {

    public static void main(String []args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("+");
        for (int i = 0; i < name.length(); i++)
            System.out.print("-");
        System.out.print("+\n");
        System.out.println("|" + name + "|");
        System.out.print("+");
        for (int i = 0; i < name.length(); i++)
            System.out.print("-");
        System.out.print("+\n");
    }
}
