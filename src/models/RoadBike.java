package models;

import bicycles.BicycleBase;

public class RoadBike extends BicycleBase {

    private int accelerationSpeed = 11;
    private int brakeSpeed = -4;

    @Override
    public int accelerate() {
        return changeSpeed(accelerationSpeed);
    }

    @Override
    public int brake() {
        return changeSpeed(brakeSpeed);
    }
}
