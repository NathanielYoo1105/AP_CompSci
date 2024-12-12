import java.util.*;

public class RunningAverage{
    private int count;
    private double average;

    public RunningAverage(){
        count = 0;
        average = 0.0;
    }

    public void updateAverage(double newVal){
        count++;
        average = ((average * (count - 1)) + newVal) / count;
    }

    public int processNewRatings(int num){
        int invalidCount = 0;

        while (i < num) {
            double rating = getNewRating();

            if (rating >= 0) {
                updateAverage(rating);
            } else {
                invalidCount++;
            }
            
            i++;
        }

        return invalidCount;
    }

    /** Returns a single numeric rating. */
    public double getNewRating(){
        /* implementation not shown */
        // we'll just pretend this takes in a user input
    }
}
