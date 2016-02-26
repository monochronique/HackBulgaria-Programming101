package DronePakage;

/**
 * Created by georgipavlov on 24.02.16.
 */
public class OpenWindow {
   private double startTime;
    private double currentTime;
    private double totalTime;
    private int batteryOnStart;
    private int expected ;

    public OpenWindow(double startTime, double currentTime, double totalTime, int batteryOnStart, int expected ) {
        this.startTime = startTime;
        this.currentTime = currentTime;
        this.totalTime = totalTime;
        this.batteryOnStart = batteryOnStart;
        this.expected  = expected ;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getCurentTime() {
        return currentTime;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public int getBateryOnStart() {
        return batteryOnStart;
    }

    public int getExspected() {
        return expected ;
    }
}
