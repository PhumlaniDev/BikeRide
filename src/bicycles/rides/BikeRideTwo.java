package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideTwo implements BikeRide {

    Bicycle bicycle;

    public BikeRideTwo(Bicycle bicycle) {
        this.bicycle = bicycle;
    }


    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        System.out.println(bicycle.currentSpeed());
    }
}
