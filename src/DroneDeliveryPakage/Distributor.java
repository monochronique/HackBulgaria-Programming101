package DroneDeliveryPakage;

import sun.awt.windows.ThemeReader;

/**
 * Created by georgipavlov on 24.02.16.
 */
public class Distributor extends Thread {
    private boolean loop = true;

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
