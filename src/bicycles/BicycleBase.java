package bicycles;

public abstract class BicycleBase implements Bicycle{

    private int speed;

    protected int changeSpeed(int change){
        return speed += change;
    }

    public int currentSpeed(){
        return this.speed;
    }

    public void stop(){
        this.speed = 0;
    }
}
