package Problem_1;
public class Data {
    private int value;
    private double average;
    private double max;

    public Data() {}

    public void addValue(double number) {
        average += number;
        max = Math.max(max, number);
        value++;
    }

    public double getAverage() {
        return average / value;
    }

    public double getMax() {
        return max;
    }
}