import java.util.*;

public class Palindrome {

    public static boolean isPalin(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (isPalin(str))
            System.out.println("Yes\n");
        else
            System.out.println("No\n");
    }
}
