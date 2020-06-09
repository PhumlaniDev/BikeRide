package bicycles.rides;

import bicycles.Bicycle;
import bicycles.models.BicycleType;

import java.util.ArrayList;

public class FunRide {

    private final ArrayList<BicycleType> bicycleList = new ArrayList<>();
    private final int maximumNumberOfBikes;

    public FunRide(int maximumNumberOfBikes) {
        this.maximumNumberOfBikes = maximumNumberOfBikes;
    }

    public String accept(BicycleType bicycleType){
        String accepted = "Accepted";
        String rejected = "Rejected";

        if (bicycleList.size() < maximumNumberOfBikes && !bicycleList.contains(bicycleType)){
            bicycleList.add(bicycleType);

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

        for (BicycleType bicycleType1: bicycleList) {
            if (bicycleType1.equals(bicycleType)) {
                count++;
            }
        }

        return count;
    }

}
