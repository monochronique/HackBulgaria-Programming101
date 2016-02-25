package DroneDeliveryPakage;

import Calculations.CalculateParameters;
import DataBase.DB;
import DronePakage.Drone;
import DronePakage.DroneV1;
import sun.awt.windows.ThemeReader;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by georgipavlov on 24.02.16.
 */
public class Distributor extends Thread {
    public static   final int NUMBER_OF_DRONES = 10;
    private boolean loop = true;
    private List<DroneV1> drones;

    public List<DroneV1> getDrones() {
        return drones;
    }

    public void setDrones(List<DroneV1> drones) {
        this.drones = drones;
    }

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
        viewForFreeBattery();

    }

    public void viewForFreeBattery() {
        ArrayList<DroneV1> drones;
        int count;

        for (int i = 0; i <DB.orders.size() ; i++) {
            int howManyDrones = CalculateParameters.getNumberOfRequiredDrones(DB.orders.peek());
            count = 0;
            drones = new ArrayList<>();
            p:for (int j = 0; j < drones.size() ; j++) {
                if(DB.orders.peek().getTime() <= drones.get(j).getBatteryUnits()){
                    if(count == howManyDrones){
                        break p;
                    }
                   count++;
                   drones.add(drones.get(j));
                }
            }
            if(count == howManyDrones){
                startDelivery(drones,DB.orders.peek());
            }else {
                System.out.println("Your delivery will be delayed " + DB.orders.peek().getCoordinates());
            }

        }
    }

    public void startDelivery(ArrayList<DroneV1> drones,Order order){
        for (int i = 0; i < drones.size() ; i++) {
            drones.get(i).setToWorking();
            drones.get(i).setOrder(order);
        }
    }
}
