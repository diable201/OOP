package problem_5;

public class Chocolate implements Comparable<Chocolate> {
    private double weight;
    private String name;

    public Chocolate() {}

    public Chocolate(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Chocolate o) {
        if (this.weight > o.weight) return 1;
        else if (this.weight < o.weight) return -1;
        return 0;
    }
}
