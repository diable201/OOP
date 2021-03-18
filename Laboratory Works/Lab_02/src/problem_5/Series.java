package problem_5;

public class Series extends Circuit {
    private Circuit x;
    private Circuit y;

    public Series() {}

    public Series(Circuit x, Circuit y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getResistance() {
        return x.getResistance() + y.getResistance();
    }

    @Override
    public double getPotentialDifference() {
        return x.getPotentialDifference() + y.getPotentialDifference();
    }

    @Override
    public void applyPotentialDifference(double voltage) {
        double current = voltage / getResistance();
        x.applyPotentialDifference(current * x.getResistance());
        y.applyPotentialDifference(current * x.getResistance());
    }
}
