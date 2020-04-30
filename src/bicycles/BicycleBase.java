package bicycles;

public abstract class BicycleBase implements Bicycle{

    private int speed;

    protected int changeSpeed(int change){
        return change += speed;
    }

    public int currentSpeed(){
        return this.speed;
    }

    public int stop(){
        return this.speed = 0;
    }
}
