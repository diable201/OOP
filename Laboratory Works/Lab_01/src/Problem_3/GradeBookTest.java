package Problem_3;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();
        Course course = new Course("CS101 Object-oriented Programming and Design", 
                "OOP helps to create more complex programs",
                3, "Programming Principles II");
        gradeBook.displayMessage();
        System.out.println(course);
        String names[]= {"A","B","C","D","E","F","G","H","I","J"};
                
        for(int i = 0; i < names.length; i++) {
            System.out.print("Student " + names[i] + ": ");
            Student student = new Student("Student " + names[i], sc.nextInt());
            gradeBook.addlist(student);
        }
        sc.close();
        gradeBook.displayGradeReport();
    }
}