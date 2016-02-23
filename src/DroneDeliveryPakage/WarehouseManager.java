package DroneDeliveryPakage;

import DataBase.TimestampAdding;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class WarehouseManager extends Thread{
    private List<TimestampAdding> timestampAddingList;
    private Warehouse warehouse;
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public WarehouseManager(Warehouse warehouse) {
        this.warehouse = warehouse;
        this.timestampAddingList = new CopyOnWriteArrayList<>();
    }

    @Override
    public void run() {
        while (loop){

        }
    }






}
