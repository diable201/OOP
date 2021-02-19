import java.util.*;

public class GPA {

    public static void main(String []args) {
        System.out.println("Enter points: ");
        Scanner scanner = new Scanner(System.in);
        int point = scanner.nextInt();
        if (point >= 95)
            System.out.println("A");
        else if (point >= 90)
            System.out.println("A-");
        else if (point >= 85)
            System.out.println("B+");
        else if (point >= 80)
            System.out.println("B");
        else if (point >= 75)
            System.out.println("B-");
        else if (point >= 70)
            System.out.println("C+");
        else if (point >= 65)
            System.out.println("C");
        else if (point >= 60)
            System.out.println("C-");
        else if (point >= 55)
            System.out.println("D+");
        else if (point >= 50)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
