package bicycles;

import java.util.ArrayList;

public class FunRide {

    private ArrayList<Bicycle> bicycleList = new ArrayList<>();
    private BicycleType bicycleType;
    private int maximumNumberOfBikes;

    public FunRide(int maximumNumberOfBikes) {
        this.maximumNumberOfBikes = maximumNumberOfBikes;
    }

    public String acceptedOrRejected(Bicycle bicycle){
        String accepted = "Accepted";
        String rejected = "Rejected";

        if (bicycleList.size() < maximumNumberOfBikes){
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
            if (bicycle.getBicycleType() == bicycleType) {
                count += 1;
            }
        }

        return count;
    }
}
