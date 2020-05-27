package ride;

import bicycles.Bicycle;
import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;
import bicycles.rides.BikeRide;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ride {

    @Test
    public void shouldBikeRideOne(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideOne = new BikeRideOne(roadBike);
        bikeRideOne.ride();
        assertEquals(7, roadBike.currentSpeed());

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5,-3,BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRideOne_Two = new BikeRideOne(mountainBike);
        bikeRideOne_Two.ride();
        assertEquals(2,mountainBike.currentSpeed());

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12,-7,BicycleType.TandemBike);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRideOne_Three = new BikeRideOne(tandemBike);
        bikeRideOne_Three.ride();
        assertEquals(5,tandemBike.currentSpeed());

    }

    @Test
    public void shouldBikeRideTwo(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideTwo = new BikeRideTwo(roadBike);
        bikeRideTwo.ride();
        assertEquals(29, roadBike.currentSpeed());

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5,-3,BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRideTwo_Two = new BikeRideTwo(mountainBike);
        bikeRideTwo_Two.ride();
        assertEquals(12,mountainBike.currentSpeed());

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12,-7,BicycleType.TandemBike);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRideTwo_Three = new BikeRideTwo(tandemBike);
        bikeRideTwo_Three.ride();
        assertEquals(29,tandemBike.currentSpeed());

    }

    @Test
    public void shouldBikeRideThree(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideThree = new BikeRideThree(roadBike);
        bikeRideThree.ride();
        assertEquals(51, roadBike.currentSpeed());

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5,-3,BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRideThree_Two = new BikeRideThree(mountainBike);
        bikeRideThree_Two.ride();
        assertEquals(22,mountainBike.currentSpeed());

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12,-7,BicycleType.TandemBike);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRideThree_Three = new BikeRideThree(tandemBike);
        bikeRideThree_Three.ride();
        assertEquals(53,tandemBike.currentSpeed());

    }
}
