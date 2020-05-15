package rides;

import bicycles.Bicycle;

public class BikeRideOne implements BikeRide {

    Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.brake();
        System.out.println(bicycle.currentSpeed());
    }
}
