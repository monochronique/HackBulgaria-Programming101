package Schedules;

import DroneDeliveryPakage.Distributor;
import DroneDeliveryPakage.Order;
import DronePakage.DroneV1;
import DronePakage.OpenWindow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by georgipavlov on 26.02.16.
 */
public class SchedulesForDeliveries {
    private List<DroneV1> drones;
    public void starSearch(Order order, int countDrones, Distributor distributor){
        drones = distributor.getDrones();
        tryToPutInOpenWindows(countDrones);


    }

    public void tryToPutInOpenWindows(int countDrones){
        ArrayList<OpenWindow> potentionalOpenWindows = new ArrayList<>();
        for (int j = 0; j < drones.size() ; j++) {
            for (int i = 0; i <drones.get(i).openWindows.size() ; i++) {

            }
        }
    }
}
