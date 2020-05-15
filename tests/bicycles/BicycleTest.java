package bicycles;

import models.MountainBike;
import models.RoadBike;
import models.TandemBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccelerate(){

        RoadBike roadBikeAccelerate = new RoadBike();
        roadBikeAccelerate.accelerate();
        assertEquals(11,roadBikeAccelerate.currentSpeed());

        MountainBike mountainBikeAccelerate = new MountainBike();
        mountainBikeAccelerate.accelerate();
        assertEquals(5,mountainBikeAccelerate.currentSpeed());

        TandemBike tandemAccelerate = new TandemBike();
        tandemAccelerate.accelerate();
        assertEquals(12,tandemAccelerate.currentSpeed());
    }

    @Test
    public void shouldMultipleAccelerate(){

        RoadBike roadBikeMultipleAccelerate = new RoadBike();
        roadBikeMultipleAccelerate.accelerate();
        roadBikeMultipleAccelerate.accelerate();
        assertEquals(22,roadBikeMultipleAccelerate.currentSpeed());

        MountainBike mountainBikeMultipleAccelerate = new MountainBike();
        mountainBikeMultipleAccelerate.accelerate();
        mountainBikeMultipleAccelerate.accelerate();
        mountainBikeMultipleAccelerate.accelerate();
        assertEquals(15,mountainBikeMultipleAccelerate.currentSpeed());

        TandemBike tandemMultipleAccelerate= new TandemBike();
        tandemMultipleAccelerate.accelerate();
        tandemMultipleAccelerate.accelerate();
        tandemMultipleAccelerate.accelerate();
        tandemMultipleAccelerate.accelerate();
        assertEquals(48,tandemMultipleAccelerate.currentSpeed());
    }

    @Test
    public void shouldMultipleAccelerateAndBrake(){

        RoadBike roadBikeMultipleAccelerateAndBrake = new RoadBike();
        roadBikeMultipleAccelerateAndBrake.accelerate();
        roadBikeMultipleAccelerateAndBrake.accelerate();
        roadBikeMultipleAccelerateAndBrake.accelerate();
        roadBikeMultipleAccelerateAndBrake.brake();
        roadBikeMultipleAccelerateAndBrake.accelerate();
        roadBikeMultipleAccelerateAndBrake.brake();
        assertEquals(36,roadBikeMultipleAccelerateAndBrake.currentSpeed());

        /*MountainBike mountainBikeMultipleAccelerateAndBrake = new MountainBike();
        roadBikeMultipleAccelerateAndBrake.accelerate();
        roadBikeMultipleAccelerateAndBrake.accelerate();
        roadBikeMultipleAccelerateAndBrake.accelerate();
        roadBikeMultipleAccelerateAndBrake.brake();
        roadBikeMultipleAccelerateAndBrake.accelerate();
        roadBikeMultipleAccelerateAndBrake.brake();
        roadBikeMultipleAccelerateAndBrake.brake();
        assertEquals(5,mountainBikeMultipleAccelerateAndBrake.currentSpeed());

        TandemBike tandemMultipleAccelerateAndBrake = new TandemBike();
        tandemMultipleAccelerateAndBrake.accelerate();
        assertEquals(12,tandemMultipleAccelerateAndBrake.currentSpeed());*/
    }

    @Test
    public void shouldBrake(){

        RoadBike roadBikeBrake = new RoadBike();
        roadBikeBrake.brake();
        assertEquals(-4,roadBikeBrake.currentSpeed());

        MountainBike mountainBikeBrake = new MountainBike();
        mountainBikeBrake.brake();
        assertEquals(-3,mountainBikeBrake.currentSpeed());

        TandemBike tandemBrake = new TandemBike();
        tandemBrake.brake();
        assertEquals(-7,tandemBrake.currentSpeed());
    }

    @Test
    public void shouldStop(){

        RoadBike roadBikeStop = new RoadBike();
        roadBikeStop.accelerate();
        roadBikeStop.accelerate();
        roadBikeStop.accelerate();
        roadBikeStop.brake();
        roadBikeStop.accelerate();
        roadBikeStop.brake();
        roadBikeStop.brake();
        roadBikeStop.accelerate();
        roadBikeStop.accelerate();
        roadBikeStop.stop();
        assertEquals(0,roadBikeStop.currentSpeed());

        MountainBike mountainBikeStop = new MountainBike();
        mountainBikeStop.accelerate();
        mountainBikeStop.accelerate();
        mountainBikeStop.accelerate();
        mountainBikeStop.brake();
        mountainBikeStop.accelerate();
        mountainBikeStop.brake();
        mountainBikeStop.brake();
        mountainBikeStop.stop();
        assertEquals(0,mountainBikeStop.currentSpeed());

        TandemBike tandemStop = new TandemBike();
        tandemStop.accelerate();
        tandemStop.accelerate();
        tandemStop.accelerate();
        tandemStop.brake();
        tandemStop.accelerate();
        tandemStop.brake();
        tandemStop.brake();
        tandemStop.stop();
        assertEquals(0,tandemStop.currentSpeed());
    }
}
