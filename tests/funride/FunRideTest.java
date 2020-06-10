package funride;

import bicycles.Bicycle;
import bicycles.models.BicycleType;
import bicycles.models.RoadBike;
import bicycles.rides.FunRide;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void shouldAcceptABike() {

        BicycleSpecification mountainBike = new BicycleSpecification(5,3, BicycleType.MountainBike);
        BicycleFromSpec mountainBike1 = new BicycleFromSpec(mountainBike);
        BicycleSpecification roadBike = new BicycleSpecification(11,4, BicycleType.RoadBike);
        Bicycle roadBike2 = new BicycleFromSpec(roadBike);
        BicycleSpecification tandemBike = new BicycleSpecification(12,7, BicycleType.TandemBike);
        Bicycle tandemBike3 = new BicycleFromSpec(tandemBike);


        FunRide funride = new FunRide(3);
        funride.accept(mountainBike1);
        assertEquals(1, funride.getCount());
        funride.accept(roadBike2);
        assertEquals(2, funride.getCount());
        funride.accept(tandemBike3);
        assertEquals(3, funride.getCount());
    }

    @Test
    public void shouldCheckDuplicateBikes() {

        BicycleSpecification mountainBike = new BicycleSpecification(5,3, BicycleType.MountainBike);
        BicycleFromSpec mountainBike1 = new BicycleFromSpec(mountainBike);
        BicycleSpecification roadBike = new BicycleSpecification(11,4, BicycleType.RoadBike);
        Bicycle roadBike2 = new BicycleFromSpec(roadBike);
        BicycleSpecification tandemBike = new BicycleSpecification(12,7, BicycleType.TandemBike);
        Bicycle tandemBike3 = new BicycleFromSpec(tandemBike);

        FunRide funride = new FunRide(3);
        funride.accept(mountainBike1);
        assertEquals(1, funride.getCountForType(mountainBike1));
        funride.accept(mountainBike1);
        assertEquals(1, funride.getCountForType(mountainBike1));

        funride.accept(roadBike2);
        assertEquals(1, funride.getCountForType(roadBike2));
        funride.accept(roadBike2);
        assertEquals(1, funride.getCountForType(roadBike2));

        funride.accept(tandemBike3);
        assertEquals(1, funride.getCountForType(tandemBike3));
        funride.accept(tandemBike3);
        assertEquals(1, funride.getCountForType(tandemBike3));
    }
}
