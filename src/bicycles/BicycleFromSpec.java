package bicycles;

public class BicycleFromSpec extends BicycleBase{

    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }

    @Override
    public int accelerate() {
        return accelerationSpeed;
    }

    @Override
    public int brake() {
        return brakeSpeed;
    }

    @Override
    public BicycleType getBicycleType() {
        return getBicycleType();
    }
}
