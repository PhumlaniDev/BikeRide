package specs;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

public class SpecsTest {

    @Test
    public void bicycleSpecification(){

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
