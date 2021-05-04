import java.util.*;

public class PersonTester {
    public static void main(String[] args) {
        System.out.println("Select an option: \n[1] Add Person \n[2] Add Student "
                + "\n[3] Add Staff \n[4] Print Info \n[5] Exit");
        Vector<Person> people = new Vector<Person>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int option = scanner.nextInt();
            if (option == 1) {
                Person p = new Person("Nurlan", "Pavlodar");
                people.add(p);
                System.out.println("Person added!");
            } else if (option == 2) {
                Student s = new Student("Tomoyo", "Tokyo", "CSS", 2, 3.15);
                people.add(s);
                System.out.println("Student added!");
            } else if (option == 3) {
                Staff st = new Staff("Askar", "Astana", "139", 300.4);
                people.add(st);
                System.out.println("Person added!");
            } else if (option == 4) {
                for (Person p : people) {
                    System.out.println(p);
                }
            } else if (option == 5) {
                scanner.close();
                break;
            }
        }
    }
}
