package ExeptionsPakage;

/**
 * Created by georgipavlov on 24.02.16.
 */
public class TooManyDrones extends Exception {

    public TooManyDrones() {
        super("too many drones are required");
    }
}
