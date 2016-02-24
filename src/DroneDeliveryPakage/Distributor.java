package DroneDeliveryPakage;

import DataBase.DB;
import DronePakage.Drone;
import sun.awt.windows.ThemeReader;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by georgipavlov on 24.02.16.
 */
public class Distributor extends Thread {
    private  final int NUMBER_OF_DRONES = 10;
    private boolean loop = true;
    private List<Drone> drones;

    public Distributor(){
        drones = new CopyOnWriteArrayList<>();
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
            try {
                tryToStartDelivery();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public void tryToStartDelivery() throws InterruptedException {
        synchronized (DB.orders){
            while (DB.orders.isEmpty()){
                this.wait();
            }
        }
        searchForDrones();

    }

    public void searchForDrones() throws InterruptedException {
        synchronized (drones){
            while (drones.isEmpty()){
                drones.wait();
            }
        }

    }

    public void viewForFreeBattery() {
        ArrayList<Order> temp;
        for (int i = 0; i <DB.orders.size() ; i++) {
            for (int j = 0; j < drones.size() ; j++) {
               if(DB.orders.peek().getTime() <= drones.get(j).getBattery()){

               }


            }

        }
    }
}
