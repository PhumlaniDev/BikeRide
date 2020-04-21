package models;

import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {

    private int accelerationSpeed = 5;
    private int brakeSpeed = -3;

    @Override
    public int accelerate() {
        return changeSpeed(accelerationSpeed);
    }

    @Override
    public int brake() {
       return changeSpeed(brakeSpeed);
    }
}
