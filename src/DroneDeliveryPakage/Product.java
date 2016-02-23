package DroneDeliveryPakage;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class Product {
    String name;
    double weightPerQuantity;

    public Product(String n, double w) {
        name = n;
        weightPerQuantity = w;
    }

    public double getWeight(){
        return weightPerQuantity;
    }
}
