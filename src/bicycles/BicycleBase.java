package bicycles;

<<<<<<< HEAD
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
=======
public abstract class BicycleBase implements Bicycle {

    private int speed;

    protected void changeSpeed(int speedNumber){
        this.speed += speedNumber;
    }

    public void stop(){
        this.speed = 0;
    }

    public int currentSpeed() {
        return this.speed;
>>>>>>> 0b77628... review commit
    }
}
