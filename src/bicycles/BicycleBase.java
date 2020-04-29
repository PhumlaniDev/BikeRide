package bicycles;

public abstract class BicycleBase implements Bicycle{

    private int speed;

    protected int changeSpeed(int change){
        return speed += change;
    }

    public int currentSpeed(){
        return 0;
    }

    public int stop(){
        return 0;
    }
}
