package bicycles;

public abstract class BicycleBase implements Bicycle {

    private int speed;

    protected int changeSpeed(int speedChanged){
        this.speed += speedChanged;
        return speedChanged;
    }

    public int currentSpeed() {
        return this.speed;
    }

    public int stop() {
        return 0;
    }
}
