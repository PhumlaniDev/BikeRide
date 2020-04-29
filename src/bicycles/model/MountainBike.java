package bicycles.model;

import bicycles.Bicycle;
import bicycles.BicycleBase;
import bicycles.BicycleType;

public class MountainBike extends BicycleBase {

    private int increaseAcceleration;
    private int braking;

    @Override
    public int accelerate() {
        return changeSpeed(increaseAcceleration);
    }

    @Override
    public int brake() {
        return changeSpeed(braking);
    }

    @Override
    public BicycleType getBicycleType() {
        return null;
    }

}
