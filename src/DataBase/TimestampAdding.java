package DataBase;

import DroneDeliveryPakage.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class TimestampAdding {
    private Map<Product, Integer> products;
    private double time;
    private double howLongTime;

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public double getHowLongTime() {
        return howLongTime;
    }

    public void setHowLongTime(double howLongTime) {
        this.howLongTime = howLongTime;
    }

    public TimestampAdding(){
        products = new HashMap<>();
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void addProducts(Product product,int quantity) {
        this.products.put(product,quantity);
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
