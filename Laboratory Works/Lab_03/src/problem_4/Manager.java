package problem_4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager() {
        super();
    }

    public Manager(String name, double salary, Date hireDate, String insuranceNumber,
                   Vector<Employee> team, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.team = team;
        this.bonus = bonus;
    }

    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    public void removeEmployee(Employee employee) {
        team.remove(employee);
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    public void setTeam(Vector<Employee> team) {
        this.team = team;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " Team: " + team + " Bonus: " + bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return (this.bonus == manager.bonus) && (this.team.equals(manager.team));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team, bonus);
    }

    @Override
    public int compareTo(Employee o) {
        Manager manager = (Manager) o;
        if (super.compareTo(o) == 0) {
            if (this.bonus > manager.bonus) return 1;
            else if (this.bonus < manager.bonus) return -1;
            return 0;
        }
        return super.compareTo(o);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
