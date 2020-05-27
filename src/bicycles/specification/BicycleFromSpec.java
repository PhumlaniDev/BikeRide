package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleBase;
import bicycles.models.BicycleType;

public class BicycleFromSpec extends BicycleBase implements Bicycle{

    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycleType;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
        this.accelerationSpeed = bicycleSpecification.getAccelerationSpeed();
        this.brakeSpeed = bicycleSpecification.getBrakeSpeed();
        this.bicycleType = bicycleSpecification.getBicycleType();
    }

    @Override
    public void accelerate() {
        changeSpeed(this.accelerationSpeed);
    }

    @Override
    public void brake() {
        changeSpeed(this.brakeSpeed);
    }

    public BicycleType getBicycle() {
        return bicycleType;
    }
}
