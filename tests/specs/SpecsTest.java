package specs;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecsTest {

    @Test
    public void bicycleSpecification(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11,-4, BicycleType.RoadBike);
        assertEquals(roadBikeSpec.getAccelerationSpeed(),11);
        System.out.println(roadBikeSpec.getAccelerationSpeed());

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5,-3, BicycleType.MountainBike);
        assertEquals(mountainBikeSpec.getAccelerationSpeed(),5);
        System.out.println(mountainBikeSpec.getAccelerationSpeed());

        BicycleSpecification tandemSpec = new BicycleSpecification(12,-7, BicycleType.Tandem);
        assertEquals(tandemSpec.getAccelerationSpeed(),12);
        System.out.println(tandemSpec.getAccelerationSpeed());
    }
}
