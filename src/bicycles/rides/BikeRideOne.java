package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideOne implements BikeRide {

    @Override
    public void ride(Bicycle bicycle) {
        bicycle.accelerate();
        bicycle.brake();
        System.out.println(bicycle.currentSpeed());
    }
}
