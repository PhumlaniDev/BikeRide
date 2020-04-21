package models;

import bicycles.Bicycle;

public class RoadBike implements Bicycle {

    private int increasedAcceleration = 11;
    private int decreasedSpeed = 4;

    @Override
    public int accelerate() {
        return this.increasedAcceleration;
    }

    @Override
    public int brake() {
        return this.decreasedSpeed;
    }

    @Override
    public int currentSpeed() {
        return this.increasedAcceleration;
    }

    @Override
    public int stop() {
        return 0;
    }
}
