package problem_5;

public class Parallel extends Circuit {
    private Circuit x;
    private Circuit y;

    public Parallel() {}

    public Parallel(Circuit x, Circuit y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getResistance() {
        return (x.getResistance() * y.getResistance()) / (x.getResistance() + y.getResistance());
    }

    @Override
    public double getPotentialDifference() {
        return x.getPotentialDifference();
    }

    @Override
    public void applyPotentialDifference(double voltage) {
        x.applyPotentialDifference(voltage);
        y.applyPotentialDifference(voltage);
    }
}
