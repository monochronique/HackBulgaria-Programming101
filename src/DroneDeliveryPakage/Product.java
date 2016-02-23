package DroneDeliveryPakage;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class Product {
    String name;
    int weightPerQuantity;

    public Product(String n, int w) {
        name = n;
        weightPerQuantity = w;
    }

    public int getWeight(){
        return weightPerQuantity;
    }
}
