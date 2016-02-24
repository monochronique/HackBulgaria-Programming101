package DroneDeliveryPakage;


import CoordinatesPakage.PairCoordinates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by georgipavlov on 24.02.16.
 */
public class Order {
    private ArrayList<Product> pakageOrder;
    private double time;
    private PairCoordinates coordinates;
    private HashMap<Integer,Integer> howManyofEachProduct;



    public Order(double time, PairCoordinates coordinates) {
        this.time = time;
        this.coordinates = coordinates;
        pakageOrder = new ArrayList<>();
        howManyofEachProduct = new HashMap<>();
    }

    public void addQuantity(int id,int quantity){
        howManyofEachProduct.put(id,quantity);
    }

    public  void addMap(HashMap<Integer,Integer> map){
        howManyofEachProduct.putAll(map);
    }

    public int returnQuantity(int id){
       return howManyofEachProduct.get(id);
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
