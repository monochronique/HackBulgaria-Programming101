package DroneDeliveryPakage;


import CoordinatesPakage.PairCoordinates;

import java.util.ArrayList;

/**
 * Created by georgipavlov on 24.02.16.
 */
public class Order {
    private ArrayList<Product> pakageOrder;
    private double time;
    private PairCoordinates coordinates;

    public Order(double time, PairCoordinates coordinates) {
        this.time = time;
        this.coordinates = coordinates;
        pakageOrder = new ArrayList<>();
    }

    public void addProduct(Product product){
        pakageOrder.add(product);
    }

    public ArrayList<Product> getPakageOrder() {
        return pakageOrder;
    }

    public double getTime() {
        return time;
    }

    public PairCoordinates getCoordinates() {
        return coordinates;
    }
}
