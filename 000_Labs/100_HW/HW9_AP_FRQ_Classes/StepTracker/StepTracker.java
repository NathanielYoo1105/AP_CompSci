import java.util.*;

public class StepTracker{
    private int actDays;
    private int tDays;
    private double avgSteps;
    private int reqSteps;

    public StepTracker(int activeSteps){
        actDays = 0;
        tDays = 0;
        avgSteps = 0;
        reqSteps = activeSteps;
    }
    
    public int activeDays(){
        return actDays;
    }
    
    public double averageSteps(){
        return avgSteps;
    }

    public void addDailySteps(int steps){
        tDays++;
        avgSteps = ((avgSteps * (tDays - 1)) + steps) / tDays;
        if(steps >= reqSteps){
            actDays++;
        }
    }
}
