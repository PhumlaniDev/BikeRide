import bicycles.Bicycle;
import bicycles.BikeRide;
import models.RoadBike;
import models.TandemBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccelerate(){

        RoadBike roadBike = new RoadBike();
        TandemBike tandemBike = new TandemBike();
        System.out.println(tandemBike.accelerate());
        System.out.println(roadBike.accelerate());
    }
}
