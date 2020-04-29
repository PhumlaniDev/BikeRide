

import bicycles.*;
import bicycles.model.MountainBike;
import bicycles.model.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleTest {

    @Test
    public void shouldAccelerate(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11,-4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne();
        bikeRideOne.ride(roadBike);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5,-3, BicycleType.MountainBike);
        Bicycle mountainsBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne bikeRideTwo = new BikeRideTwo();
        bikeRideTwo.ride(mountainsBike);

        BicycleSpecification tandemSpec = new BicycleSpecification(12,-7, BicycleType.Tandem);
        Bicycle tadndem = new BicycleFromSpec(tandemSpec);
        BikeRideOne bikeRideThree = new BikeRideThree();
        bikeRideThree.ride(tadndem);
    }
}
