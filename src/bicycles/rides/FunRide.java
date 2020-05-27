package bicycles.rides;

import bicycles.Bicycle;
import bicycles.models.BicycleType;

import java.util.ArrayList;

public class FunRide {

    private final ArrayList<Bicycle> bicycleList = new ArrayList<>();
    private final int maximumNumberOfBikes;

    public FunRide(int maximumNumberOfBikes) {
        this.maximumNumberOfBikes = maximumNumberOfBikes;
    }

    public String accept(Bicycle bicycle){
        String accepted = "Accepted";
        String rejected = "Rejected";

        if (bicycleList.size() < maximumNumberOfBikes && !bicycleList.contains(bicycle)){
            bicycleList.add(bicycle);

            return accepted;
        }

        else {
            return rejected;
        }
    }

    public int getCount(){
        return bicycleList.size();
    }

    public int getCountForType(BicycleType bicycleType){
        int count = 0;

        for (Bicycle bicycle: bicycleList) {
            if (bicycle.equals(bicycleType)) {
                count++;
            }
        }

        return count;
    }

}
