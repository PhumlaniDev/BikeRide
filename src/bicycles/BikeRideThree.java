package bicycles;

public class BikeRideThree extends BikeRideOne implements BikeRide{

    @Override
    public void ride(Bicycle bicycle) {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        System.out.println(bicycle.currentSpeed());
    }
}
