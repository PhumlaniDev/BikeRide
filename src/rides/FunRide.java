package rides;

import bicycles.Bicycle;
import models.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    private final ArrayList<BicycleType> bicycleList = new ArrayList<BicycleType>();
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
            if (bicycleType1 == bicycleType) {
                count = count + count;
            }
        }

        return count;
    }

}
