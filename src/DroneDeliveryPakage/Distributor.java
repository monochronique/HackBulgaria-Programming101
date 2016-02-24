package DroneDeliveryPakage;

import DronePakage.Drone;
import sun.awt.windows.ThemeReader;

import java.util.ArrayList;

/**
 * Created by georgipavlov on 24.02.16.
 */
public class Distributor extends Thread {
    private  final int NUMBER_OF_DRONES = 10;
    private boolean loop = true;
    private ArrayList<Drone> drones;

    public Distributor(){

    }

    public void startDrones(){
        for (int i = 0; i <NUMBER_OF_DRONES ; i++) {
            //drones.add(new Drone())
        }
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop){

        }


    }
}
