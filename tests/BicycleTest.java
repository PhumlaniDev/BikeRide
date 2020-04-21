import bicycles.Bicycle;
import bicycles.BikeRide;
import models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccelerate(){

        RoadBike bicycle = new RoadBike();

        System.out.println(bicycle.currentSpeed());
    }
}
