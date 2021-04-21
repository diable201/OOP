package problem_4;

import java.util.Collections;
import java.util.Date;
import java.util.Vector;

public class Tester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vector<Employee> employees = new Vector<>();
        Vector<Employee> employees1 = new Vector<>();
        Employee e1 = new Employee("Azusa", 110, new Date(2012, 2, 2),
                "Id1");
        Employee e2 = new Employee("Mio", 220, new Date(2010, 3, 23),
                "Id2");
        Employee e3 = new Employee("Ui", 40, new Date(2016, 4, 25),
                "Id3");
//        Employee e4 = (Employee) e3.clone();
//        System.out.println(e4);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);


        Vector<Manager> managers = new Vector<>();
        Manager m1 = new Manager("Nagisa", 12000, new Date(2010, 4, 2),
                "Id1", employees, 18);
        Manager m2 = new Manager("Ai", 12000, new Date(2011, 4, 2),
                "Id2", employees1, 19);
        managers.add(m1);
        managers.add(m2);
        Collections.sort(managers);
        System.out.println(managers);
//        System.out.println(m1);
        Collections.sort(employees);
//        employees.sort(new NameComparator());
//        employees.sort(new HireDateComparator());
        System.out.println(employees);
    }
}
