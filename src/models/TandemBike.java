package models;

import bicycles.BicycleBase;

public class TandemBike extends BicycleBase {

    private int accelerationSpeed = 12;
    private int brakeSpeed = -7;

    @Override
    public int accelerate() {
       return changeSpeed(accelerationSpeed);
    }

    @Override
    public int brake() {
        return changeSpeed(brakeSpeed);
    }
}
