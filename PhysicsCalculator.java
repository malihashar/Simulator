public class PhysicsCalculator {

    public double airDensity;
    public double velocity;
    public double wingArea;
    public double liftCoefficient;
    public double dragCoefficient;
    public double mass;
    public double gravity;
    public double thrust;

    public double calculateLift() {
        double lift = 0.5 * airDensity * velocity * velocity * wingArea * liftCoefficient;
        return lift;
    }

    public double calculateDrag() {
        double drag = 0.5 * airDensity * velocity * velocity * wingArea * dragCoefficient;
        return drag;
    }

    public double calculateWeight() {
        double weight = mass * gravity;
        return weight;
    }

    public double calculateThrust() {
        return thrust;
    }
}
