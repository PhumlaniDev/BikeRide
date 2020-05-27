package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideThree implements BikeRide {
    Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        System.out.println(bicycle.currentSpeed());
    }
}
