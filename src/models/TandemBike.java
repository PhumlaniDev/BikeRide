package models;

import bicycles.BicycleBase;

public class TandemBike extends BicycleBase {

    @Override
    public void accelerate() {
        changeSpeed(12);
    }

    @Override
    public void brake() {
        changeSpeed(-7);
    }
}
