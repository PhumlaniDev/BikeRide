package funride;

import bicycles.Bicycle;
import bicycles.models.BicycleType;
import bicycles.models.RoadBike;
import bicycles.rides.FunRide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void shouldAcceptABike() {

        FunRide funride = new FunRide(3);
        funride.accept(BicycleType.RoadBike);
        assertEquals(1, funride.getCount());
        funride.accept(BicycleType.MountainBike);
        assertEquals(2, funride.getCount());
        funride.accept(BicycleType.TandemBike);
        assertEquals(3, funride.getCount());
    }

    @Test
    public void shouldCheckDuplicateBikes() {

        FunRide funride = new FunRide(3);
        funride.accept(BicycleType.RoadBike);
        assertEquals(1, funride.getCountForType(BicycleType.RoadBike));
        funride.accept(BicycleType.RoadBike);
        assertEquals(1, funride.getCountForType(BicycleType.RoadBike));

        funride.accept(BicycleType.MountainBike);
        assertEquals(1, funride.getCountForType(BicycleType.MountainBike));
        funride.accept(BicycleType.MountainBike);
        assertEquals(1, funride.getCountForType(BicycleType.MountainBike));

        funride.accept(BicycleType.TandemBike);
        assertEquals(1, funride.getCountForType(BicycleType.TandemBike));
        funride.accept(BicycleType.TandemBike);
        assertEquals(1, funride.getCountForType(BicycleType.TandemBike));
    }
}
