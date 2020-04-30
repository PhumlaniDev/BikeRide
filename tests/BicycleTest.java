import bicycles.*;
import bicycles.model.MountainBike;
import bicycles.model.RoadBike;
import bicycles.model.Tandem;
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
