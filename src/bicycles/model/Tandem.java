package bicycles.model;

import bicycles.Bicycle;
import bicycles.BicycleBase;
import bicycles.BicycleType;

public class Tandem extends BicycleBase implements Bicycle {

    private int increaseAcceleration = 12;
    private int braking = -7;

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
