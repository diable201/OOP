package problem_4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee() {
        super();
    }

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " Salary: " + salary + " Hire Date: " + hireDate +
                " Insurance Number: " + insuranceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return (this.salary == employee.salary) && (this.hireDate.equals(employee.hireDate))
                && (this.insuranceNumber.equals(employee.insuranceNumber));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, hireDate, insuranceNumber);
    }

    @Override
    public int compareTo(Employee o) {
        if (this.salary > o.salary) return 1;
        else if (this.salary < o.salary) return -1;
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
