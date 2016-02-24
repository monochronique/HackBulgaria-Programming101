package DroneDeliveryPakage;

import java.util.ArrayList;

/**
 * Created by georgipavlov on 24.02.16.
 */
public class Orders {
    private ArrayList<Order> pakageOrder = new ArrayList<>();

    public Orders(ArrayList<Order> pakageOrder) {
        this.pakageOrder = pakageOrder;
    }

    public ArrayList<Order> getPakageOrder() {
        return pakageOrder;
    }

}
