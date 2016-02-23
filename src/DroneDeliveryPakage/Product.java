package DroneDeliveryPakage;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class Product {
    private String name;
    private double weightPerQuantity;
    private int id;


    public Product(String n, double w,int id) {
        name = n;
        weightPerQuantity = w;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getWeightPerQuantity() {
        return weightPerQuantity;
    }

    public int getId() {
        return id;
    }
}
