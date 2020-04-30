import bicycles.*;
import bicycles.model.MountainBike;
import bicycles.model.RoadBike;
import bicycles.model.Tandem;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccelerate(){

        RoadBike roadBikeAccelerate = new RoadBike();
        roadBikeAccelerate.accelerate();
        assertEquals(roadBikeAccelerate.accelerate(),-4);

        MountainBike mountainBikeAccelerate = new MountainBike();
        mountainBikeAccelerate.accelerate();
        assertEquals(mountainBikeAccelerate.accelerate(),-3);

        Tandem tandemAccelerate = new Tandem();
        tandemAccelerate.accelerate();
        assertEquals(tandemAccelerate.accelerate(),-7);
    }

    @Test
    public void shouldBrake(){

        RoadBike roadBikeBrake = new RoadBike();
        roadBikeBrake.brake();
        assertEquals(roadBikeBrake.brake(),-4);

        MountainBike mountainBikeBrake = new MountainBike();
        mountainBikeBrake.brake();
        assertEquals(mountainBikeBrake.brake(),-3);

        Tandem tandemBrake = new Tandem();
        tandemBrake.brake();
        assertEquals(tandemBrake.brake(),-7);
    }

    @Test
    public void shouldAccelerateAndBrakeCorrect() {

        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.brake();
        assertEquals(2, roadBike.currentSpeed());

        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.brake();
        assertEquals(2, mountainBike.currentSpeed());

        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.brake();
        assertEquals(2, tandem.currentSpeed());

    }

    @Test
    public void shouldStop(){

        RoadBike roadBikeStop = new RoadBike();
        roadBikeStop.stop();
        assertEquals(roadBikeStop.stop(),0);

        MountainBike mountainBikeStop = new MountainBike();
        mountainBikeStop.stop();
        assertEquals(mountainBikeStop.stop(),0);

        Tandem tandemAccelerate = new Tandem();
        tandemAccelerate.stop();
        assertEquals(tandemAccelerate.stop(),0);
    }

    @Test
    public  void showCurrentSpeed(){

        RoadBike roadBikeCurrentSpeed = new RoadBike();
        roadBikeCurrentSpeed.accelerate();
        roadBikeCurrentSpeed.currentSpeed();
        assertEquals(roadBikeCurrentSpeed.currentSpeed(),5);

        MountainBike mountainBikeCurrentSpeed = new MountainBike();
        mountainBikeCurrentSpeed.accelerate();
        assertEquals(mountainBikeCurrentSpeed.stop(),4);

        Tandem tandemCurrentSpeed = new Tandem();
        tandemCurrentSpeed.accelerate();
        assertEquals(tandemCurrentSpeed.stop(),2);

    }

}
