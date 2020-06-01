package specs;

import bicycles.Bicycle;
import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;
import bicycles.specification.BicycleFromSpec;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {

    @Test
    public void bicycleSpecification(){

        //RoadBike

        bicycles.specification.BicycleSpecification roadBikeSpec = new bicycles.specification.BicycleSpecification(11,-4, BicycleType.RoadBike);
        assertEquals(BicycleType.RoadBike,roadBikeSpec.getBicycleType());
        assertEquals(roadBikeSpec.getAccelerationSpeed(),11);

        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        roadBike.accelerate();
        assertEquals(11, roadBike.currentSpeed());
        roadBike.brake();
        assertEquals(7, roadBike.currentSpeed());
        roadBike.stop();
        assertEquals(0, roadBike.currentSpeed());

        //MountainBike

        bicycles.specification.BicycleSpecification mountainBikeSpec = new bicycles.specification.BicycleSpecification(5,-3, BicycleType.MountainBike);
        assertEquals(BicycleType.MountainBike,mountainBikeSpec.getBicycleType());
        assertEquals(mountainBikeSpec.getAccelerationSpeed(),5);

        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        mountainBike.accelerate();
        assertEquals(5, mountainBike.currentSpeed());
        mountainBike.accelerate();
        assertEquals(10, mountainBike.currentSpeed());
        mountainBike.accelerate();
        assertEquals(15, mountainBike.currentSpeed());
        mountainBike.brake();
        assertEquals(12, mountainBike.currentSpeed());
        mountainBike.stop();
        assertEquals(0, mountainBike.currentSpeed());

        //TandemBike

        bicycles.specification.BicycleSpecification tandemSpec = new bicycles.specification.BicycleSpecification(12,-7, BicycleType.TandemBike);
        assertEquals(BicycleType.TandemBike,tandemSpec.getBicycleType());
        assertEquals(tandemSpec.getAccelerationSpeed(),12);

        Bicycle tandemBike = new BicycleFromSpec(tandemSpec);
        tandemBike.accelerate();
        assertEquals(12, tandemBike.currentSpeed());
        tandemBike.accelerate();
        assertEquals(24, tandemBike.currentSpeed());
        tandemBike.accelerate();
        assertEquals(36, tandemBike.currentSpeed());
        tandemBike.brake();
        assertEquals(29, tandemBike.currentSpeed());
        tandemBike.brake();
        assertEquals(22, tandemBike.currentSpeed());
        tandemBike.stop();
        assertEquals(0, tandemBike.currentSpeed());

    }
}
