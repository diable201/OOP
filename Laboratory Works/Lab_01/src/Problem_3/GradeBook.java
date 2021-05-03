package Problem_3;
import java.util.ArrayList;

public class GradeBook {
    public double average;
    public int cnt = 0;
    ArrayList<Student> listOfStudents = new ArrayList<Student>();

    public void displayMessage() {
        System.out.print("Welcome to the grade book for ");
    }
    
    public void addlist(Student first) {
        listOfStudents.add(first);
        cnt++;
    }

    public void displayGradeReport() {
        determineClassAverage();
        determineClassMin();
        determineClassMax();
        gradesDistribution();
    }

    public void determineClassAverage() {
        average = 0;
        for (Student s : listOfStudents) 
            average += s.getMark();
        System.out.print("Class average is " + average / listOfStudents.size());
    }
    

    public void gradesDistribution() {
        System.out.print("00-09: ");
        for (int i = 0; i < listOfStudents.size(); i++) 
            if (listOfStudents.get(i).getMark() >= 0 && listOfStudents.get(i).getMark() < 10) 
                System.out.print("*");
            System.out.println();
        System.out.print("10-19: ");
        for (int i = 0; i < listOfStudents.size(); i++) 
            if (listOfStudents.get(i).getMark() >= 10 && listOfStudents.get(i).getMark() < 20) 
                System.out.print("*");
        System.out.println();
        System.out.print("20-29: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getMark() >= 20 && listOfStudents.get(i).getMark() < 30) 
                System.out.print("*");
        System.out.println();
        System.out.print("30-39: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getMark() >= 30 && listOfStudents.get(i).getMark() < 40) 
                System.out.print("*");
        System.out.println();
        System.out.print("40-49: ");
        for (int i = 0; i < listOfStudents.size(); i++) 
            if (listOfStudents.get(i).getMark() >= 40 && listOfStudents.get(i).getMark() < 50) 
                System.out.print("*");
        System.out.println();
        System.out.print("50-59: ");
        for (int i = 0; i < listOfStudents.size(); i++) 
            if (listOfStudents.get(i).getMark() >= 50 && listOfStudents.get(i).getMark() < 60) 
                System.out.print("*");
        System.out.println();
        System.out.print("60-69: ");
        for (int i = 0; i < listOfStudents.size(); i++) 
            if (listOfStudents.get(i).getMark() >= 60 && listOfStudents.get(i).getMark() < 70) 
                System.out.print("*");
        System.out.println();
        System.out.print("70-79: ");
        for (int i = 0; i < listOfStudents.size(); i++) 
            if (listOfStudents.get(i).getMark() >= 70 && listOfStudents.get(i).getMark() < 80) 
                System.out.print("*");
        System.out.println();
        System.out.print("80-89: ");
        for (int i = 0; i < listOfStudents.size(); i++) 
            if (listOfStudents.get(i).getMark() >= 80 && listOfStudents.get(i).getMark() < 90) 
                System.out.print("*");
        System.out.println();
        System.out.print("90-99: ");
        for (int i = 0; i < listOfStudents.size(); i++) 
            if (listOfStudents.get(i).getMark() >= 90 && listOfStudents.get(i).getMark() < 100) 
                System.out.print("*");
        System.out.println();
        System.out.print("100: ");
        for (int i = 0; i < listOfStudents.size(); i++) 
            if (listOfStudents.get(i).getMark() == 100) 
                System.out.print("*");
        System.out.println();
    }
    
    public void determineClassMin() {
        int minmark = listOfStudents.get(0).getMark();
        int index = 0;
        for (int i = 1; i < listOfStudents.size(); i++) {
            if (listOfStudents.get(i).getMark() < minmark) {
                minmark = listOfStudents.get(i).getMark();
                index = i;
            }
        }
        System.out.println(
            "\nLowest grade is " + minmark + " (" + listOfStudents.get(index).getName() + 
            ", id: " + listOfStudents.get(index).getIdNum() + ")");

    }

    public void determineClassMax() {
        int maxmark = listOfStudents.get(0).getMark();
        int index = 0;
        for (int i = 1; i < listOfStudents.size(); i++) {
            if (listOfStudents.get(i).getMark() > maxmark) {
                maxmark = listOfStudents.get(i).getMark();
                index = i;
            }
        }
        System.out.println(
            "Highest grade is " + maxmark + " (" + listOfStudents.get(index).getName() + 
            ", id: " + listOfStudents.get(index).getIdNum() + ")");
    }
    
    public String toString() {
        return "\nAverage = " + average + "\nCount = " + cnt;
    }
    
}
