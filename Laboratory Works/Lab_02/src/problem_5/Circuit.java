package problem_5;

public abstract class Circuit {
    public abstract double getResistance();

    public abstract double getPotentialDifference();

    public abstract void applyPotentialDifference(double voltage);

    public double getPower() {
        return Math.pow(getPotentialDifference(), 2) / getResistance();
    }

    public double getCurrent() {
        return getPotentialDifference() / getResistance();
    }
}
