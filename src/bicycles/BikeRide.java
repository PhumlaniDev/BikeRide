package bicycles;

public class BikeRide {

    private int speed = 0;
    private Bicycle bicycle;

    public BikeRide(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public int currentSpeed(){return this.speed;}

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
}
