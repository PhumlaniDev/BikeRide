package bicycles;

public interface Bicycle {

    int accelerate();

    int brake();

    int currentSpeed();

    int stop();

    BicycleType getBicycleType();
}
