package problem_5;

public class Resistor extends Circuit {
    private double resistance;
    private double potentialDifference;

    public Resistor() {
        resistance = 0.0;
    }

    public Resistor(double resistance) {
        this.resistance = resistance;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public double getPotentialDifference() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDifference(double voltage) {
        potentialDifference = voltage;
    }
}
